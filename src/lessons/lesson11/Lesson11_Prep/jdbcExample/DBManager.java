package lessons.lesson11.Lesson11_Prep.jdbcExample;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class DBManager {

  private static final String DATABASE_URL =
      "jdbc:mysql://127.0.0.1:3306/bhj20?serverTimezone=UTC";
  private static final String USER = "root";
  private static final String PASS = "root";

  private static final String query =
      "insert into employees value (null, 'Romuald', '2018-01-05', 1200, 2);";
  private static final String query2 =
      "update employees set salary = salary + 100 where specialty_id = 4;";
  private static final String query3 =
      "select id as 'i', specialty as 's' from specialties limit ?, ?;";
  private static final String query4 =
      "select * from employees e join specialties s on (e.specialty_id = s.id) where " +
          "name like ?;";

  private Connection connection;

  {
    try {
      connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Employee> getEmployeesListByCharInclude(char c) throws SQLException {

    PreparedStatement preparedStatement = connection.prepareStatement(query4);

    preparedStatement.setString(1, "%" + c + "%");

    ResultSet resultSet = preparedStatement.executeQuery();

    List<Employee> employeeList = new ArrayList<>();

    Set<Specialty> specialties = new HashSet<>();

    while (resultSet.next()) {

      int idEmpl = resultSet.getInt(1);
      String name = resultSet.getString(2);
      Date date = resultSet.getDate(3);
      int salary = resultSet.getInt(4);

      int idSpec = resultSet.getInt(6);
      String specialtyTitle = resultSet.getString("specialty");

      Specialty specialty = new Specialty(idSpec, specialtyTitle);
      specialties.add(specialty);

      Employee employee = new Employee(idEmpl, name, date, salary,
          specialties.stream().filter(
              s -> s.equals(specialty)).findFirst().orElseThrow(RuntimeException::new
          )
      );

      employeeList.add(employee);
    }

    return employeeList;
  }

  public void initDBConnection() throws SQLException {

//    Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

    /*Statement statement = connection.createStatement();

    int executeResult = statement.executeUpdate(query2);

    System.out.println(executeResult);*/

    PreparedStatement preparedStatement = connection.prepareStatement(query3);
    preparedStatement.setInt(1, 1);
    preparedStatement.setInt(2, 3);

    ResultSet resultSet = preparedStatement.executeQuery();
    List<Specialty> specialties = new ArrayList<>();

    while (resultSet.next()) {
      int id = resultSet.getInt(1);
      String specialty = resultSet.getString("s");

      specialties.add(new Specialty(id, specialty));
    }

    System.out.println(specialties);

  }
}
