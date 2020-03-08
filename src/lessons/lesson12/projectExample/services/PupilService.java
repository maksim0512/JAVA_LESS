package lessons.lesson12.projectExample.services;

import lessons.lesson12.projectExample.db.DBManager;
import lessons.lesson12.projectExample.dto.PupilForm;
import lessons.lesson12.projectExample.exceptions.NoSuchPupilException;
import lessons.lesson12.projectExample.model.Pupil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PupilService
{

  private static final String GET_ALL_QUERY = "select * from pupils;";
  private static final String SAVE_NEW_PUPIL =
      "insert into pupils value (null, ?, ?)";
  private static final String IS_NAME_PERSIST =
      "select count(name) from pupils where name = ?;";
  private static final String DELETE_BY_NAME =
      "delete from pupils where name = ?;";


  public List<Pupil> getAll() throws SQLException
  {

    Statement statement = DBManager.getConnection().createStatement();
    ResultSet resultSet = statement.executeQuery(GET_ALL_QUERY);

    List<Pupil> result = new ArrayList<>();

    while (resultSet.next())
    {
      int id = resultSet.getInt(1);
      String name = resultSet.getString(2);
      int age = resultSet.getInt(3);

      result.add(new Pupil(id, name, age));
    }

    return result;
  }

  public void saveNewPupil(PupilForm form) throws SQLException
  {
    if (isNamePersists(form.getName()))
    {
      System.err.println("Duplicate name");
      return;
    }

    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(SAVE_NEW_PUPIL);

    preparedStatement.setString(1, form.getName());
    preparedStatement.setInt(2, form.getAge());

    preparedStatement.executeUpdate();
  }

  public void deletePupilByName(String name) throws SQLException
  {
    if (!isNamePersists(name)) {
      throw new NoSuchPupilException(name);
    }

    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(DELETE_BY_NAME);

    preparedStatement.setString(1, name);

    preparedStatement.executeUpdate();
  }

  private boolean isNamePersists(String name) throws SQLException
  {
    PreparedStatement preparedStatement =
        DBManager.getConnection().prepareStatement(IS_NAME_PERSIST);

    preparedStatement.setString(1, name);

    ResultSet resultSet = preparedStatement.executeQuery();

    resultSet.next();

    int count = resultSet.getInt(1);

    return count >= 1;
  }
}
