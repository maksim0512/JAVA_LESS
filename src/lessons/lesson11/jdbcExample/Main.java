package lessons.lesson11.jdbcExample;

import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        DBManager manager = new DBManager();
        manager.initDBConnection();
    }
}
