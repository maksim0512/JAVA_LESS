package Project;

import Project.dto.AssortmentForm;
import Project.exceptions.NoSuchAssortmentException;
import Project.services.IOService;
import Project.services.Service;

import java.io.IOException;
import java.sql.SQLException;

public class MainMenu
{
  private final IOService ioService;
  private final Service service;

  public MainMenu()
  {
    this.ioService = new IOService();
    this.service = new Service();
  }

  public void start()
  {

    String menuInput = "";

    do
    {
      System.out.println();
      ioService.printLegend();

      try
      {
        menuInput = ioService.getString();
      }
      catch (IOException e)
      {
        System.err.println("ERROR: Bad input");
      }

      switch (menuInput)
      {
        case "1":
          try
          {
            service.getAll().forEach(System.out::println);
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "2":
          try
          {
            AssortmentForm form = getProductFormFromConsole();
            service.saveNewProduct(form);
          }
          catch (IOException | NumberFormatException e)
          {
            System.err.println("Bad input");
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "3":
          deleteProduct();
          break;
        case "4":
          try
          {
            service.getAllCustomer().forEach(System.out::println);
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "5":
          try
          {
            service.getAllBasket().forEach(System.out::println);
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "6":
          try
          {
            System.out.println("Enter customer:");
            try
            {
              String customer = ioService.getString();
              service.getAllBasketCustomer(customer).forEach(System.out::println);
            }
            catch (IOException e)
            {
              System.err.println("Bad input");
            }
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "7":
          try
          {
            System.out.println("Enter customer:");
            try
            {
              String customer = ioService.getString();
              service.AddProductsInBasket(customer);
            }
            catch (IOException e)
            {
              System.err.println("Bad input");
            }
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "e":
          System.out.println("Goodbye!");
          break;
        default:
          System.err.println("Bad input");
          break;
      }

    }
    while (!menuInput.equals(IOService.EXIT_CHAR));
  }

  private void deleteProduct()
  {
    System.out.println("Enter product:");
    try
    {
      String product = ioService.getString();
      service.deleteProductByName(product);
    }
    catch (IOException e)
    {
      System.err.println("Bad input");
    }
    catch (NoSuchAssortmentException e)
    {
      System.err.println("No such product: " + e.getMessage());
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }



  private AssortmentForm getProductFormFromConsole() throws IOException, NumberFormatException
  {

    System.out.println("Enter product:");
    String product = ioService.getString();
    System.out.println("Enter price:");
    int price = ioService.getInt();

    return new AssortmentForm(product, price);
  }
}
