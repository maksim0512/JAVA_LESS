package Project.services;

import Project.db.DBManager;
import Project.dto.AssortmentForm;
import Project.exceptions.NoSuchAssortmentException;
import Project.model.Assortment;
import Project.model.Basket;
import Project.model.Customer;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Service
{

  private static final String GET_ALL_QUERY =
          "select * from assortment;";
  private static final String SAVE_NEW_PRODUCT =
      "insert into assortment value (null, ?, ?)";
  private static final String IS_NAME_PERSIST =
      "select count(product) from assortment where product = ?;";
  private static final String DELETE_BY_NAME =
      "delete from assortment where product = ?;";
  private static final String GET_ALL_CUSTOMER =
          "select * from customers;";
  private static final String GET_ALL_BASKET =
          "select c.name, a.product, a.price  from assortment a  join basket b  on a.id_assort=b.id_assort  join  customers c on c.id_cust=b.id_cust  order by c.name;";
  private static final String GET_ALL_BASKET_CUSTOMER =
          "select c.name, a.product, a.price  from assortment a  join basket b  on a.id_assort=b.id_assort  join  customers c on c.id_cust=b.id_cust  where c.name = ?;";
  private static final String ADD_PRODUCT_IN_BASKET =
          "insert into basket value ( ?, ?)";
  private static final String GET_ID_CUST =
          "select id_cust from customers where name = ?;";
  private static final String GET_ID_ASSORT =
          "select id_assort from assortment where product = ?;";


  //экземпляр класса IOService
  IOService ioService = new IOService();



  //Получить весь ассортимент
  public List<Assortment> getAll() throws SQLException
  {

    Statement statement = DBManager.getConnection().createStatement();
    ResultSet resultSet = statement.executeQuery(GET_ALL_QUERY);

    List<Assortment> result = new ArrayList<>();

    while (resultSet.next())
    {
      int id_assort = resultSet.getInt(1);
      String product = resultSet.getString(2);
      int price = resultSet.getInt(3);

      result.add(new Assortment(id_assort, product, price));
    }

    return result;
  }


  //Добавить новый продукт
  public void saveNewProduct(AssortmentForm form) throws SQLException
  {
    if (isNamePersists(form.getProduct()))
    {
      System.err.println("Duplicate name");
      return;
    }

    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(SAVE_NEW_PRODUCT);

    preparedStatement.setString(1, form.getProduct());
    preparedStatement.setInt(2, form.getPrice());

    preparedStatement.executeUpdate();
  }


  //Удалить продукт по имени
  public void deleteProductByName(String name) throws SQLException
  {
    if (!isNamePersists(name)) {
      throw new NoSuchAssortmentException(name);
    }

    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(DELETE_BY_NAME);

    preparedStatement.setString(1, name);

    preparedStatement.executeUpdate();
  }


  //Вывести всех покупателей
  public List<Customer> getAllCustomer() throws SQLException
  {

    Statement statement = DBManager.getConnection().createStatement();
    ResultSet resultSet = statement.executeQuery(GET_ALL_CUSTOMER);

    List<Customer> result = new ArrayList<>();

    while (resultSet.next())
    {
      int id_cust = resultSet.getInt(1);
      String name = resultSet.getString(2);

      result.add(new Customer(id_cust, name));
    }

    return result;
  }


  //Вывести покупки всех покупателей
  public List<Basket> getAllBasket() throws SQLException
  {

    Statement statement = DBManager.getConnection().createStatement();
    ResultSet resultSet = statement.executeQuery(GET_ALL_BASKET);

    List<Basket> result = new ArrayList<>();

    while (resultSet.next())
    {
      String name = resultSet.getString(1);
      String product = resultSet.getString(2);
      int price = resultSet.getInt(3);

      result.add(new Basket(name, product, price));
    }

    return result;
  }



  //Вывести покупки покупателя по его имени
  public List<Basket> getAllBasketCustomer(String customer) throws SQLException
  {

    PreparedStatement preparedStatement =
            DBManager.getConnection().prepareStatement(GET_ALL_BASKET_CUSTOMER);

    preparedStatement.setString(1, customer);

    ResultSet resultSet = preparedStatement.executeQuery();

    List<Basket> result = new ArrayList<>();

    while (resultSet.next())
    {
      String name = resultSet.getString(1);
      String product = resultSet.getString(2);
      int price = resultSet.getInt(3);

      result.add(new Basket(name, product, price));
    }

    return result;
  }


  //Добавить продукты в корзину покупателю
  public void AddProductsInBasket(String customer) throws SQLException
  {

    //Находим id_cust
    int id_cust = 0;

    PreparedStatement pS1 =
            DBManager.getConnection().prepareStatement(GET_ID_CUST);

    pS1.setString(1, customer);
    ResultSet resultSet1 = pS1.executeQuery();

    while (resultSet1.next())
    {
      id_cust = resultSet1.getInt(1);
    }


    String menuInputProduct = "";

    while (!menuInputProduct.equals("e"))
    {
      String product = "";
      int id_assort = 0;

      System.out.println("Enter product:");
      try
      {
        product = ioService.getString();
      }
      catch (IOException e)
      {
        System.err.println("Bad input");
      }

      //Находим id_assort
      PreparedStatement pS2 =
              DBManager.getConnection().prepareStatement(GET_ID_ASSORT);

      pS2.setString(1, product);
      ResultSet resultSet2 = pS2.executeQuery();
      while (resultSet2.next())
      {
        id_assort = resultSet2.getInt(1);
      }


      //Вносим в корзину покупателю
      PreparedStatement pS3 =
              DBManager.getConnection().prepareStatement(ADD_PRODUCT_IN_BASKET);

      pS3.setInt(1, id_cust);
      pS3.setInt(2, id_assort);

      pS3.executeUpdate();

      //Выйти?
      System.out.println("Exit -> e ?:");
      try
      {
        menuInputProduct = ioService.getString();
      }
      catch (IOException e)
      {
        System.err.println("Bad input");
      }

    }

  }



  private boolean isNamePersists(String product) throws SQLException
  {
    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(IS_NAME_PERSIST);

    preparedStatement.setString(1, product);

    ResultSet resultSet = preparedStatement.executeQuery();

    resultSet.next();

    int count = resultSet.getInt(1);

    return count >= 1;
  }
}
