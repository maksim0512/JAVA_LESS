package lessons.lesson11.jdbcExample;

import java.sql.*;

public class DBManager
{
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/lesson?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static final String query = "insert into employees value (null, 'Sigizmund', '2018-01-05', 1200, 1);";
    private static final String query1 = "update employees set salary = salary + 100 where specialty_id = 4;";
    private static final String query2 = "select id as 'i', specialty as 's' from specialties limit ?, ?;";
    private static final String query3 = "select * from employees e  join  specialties s  on  e.specialty_id = s.id  where name like  ?;";

    private Connection connection;

    public void initDBConnection() throws SQLException
    {
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        //Update, Delete, Insert
        Statement statement = connection.createStatement();
        //statement.executeUpdate(query);

        /////////Select
        PreparedStatement preparedstatement = connection.prepareStatement(query2);
        preparedstatement.setInt(1,1);//Устанавливаем параметры
        preparedstatement.setInt(2,3);

        ResultSet resultset = preparedstatement.executeQuery();

        while(resultset.next())
        {
            int id = resultset.getInt(1);
            String specialty = resultset.getString("s");
        }

    }

    public void initDBConnection2(char c) throws SQLException
    {
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        PreparedStatement preparedstatement = connection.prepareStatement(query3);
        preparedstatement.setString(1, "'%" + c + "%'");
        ResultSet resultset = preparedstatement.executeQuery();

        while(resultset.next())//Считываем выполненный запрос
        {
            int idEmpl = resultset.getInt(1);
            String name = resultset.getString(2);
            Date date = resultset.getDate(3);
            int salary = resultset.getInt(4);
        }


    }



}
