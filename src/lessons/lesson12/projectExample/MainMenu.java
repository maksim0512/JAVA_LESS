package lessons.lesson12.projectExample;

import lessons.lesson12.projectExample.dto.PupilForm;
import lessons.lesson12.projectExample.exceptions.NoSuchPupilException;
import lessons.lesson12.projectExample.services.IOService;
import lessons.lesson12.projectExample.services.PupilService;

import java.io.IOException;
import java.sql.SQLException;

public class MainMenu
{
  private final IOService ioService;
  private final PupilService pupilService;

  public MainMenu()
  {
    this.ioService = new IOService();
    this.pupilService = new PupilService();
  }

  public void start()
  {

    String menuInput = "";

    do
    {
      ioService.printLegend();
      try
      {
        menuInput = ioService.getString();
      }
      catch (IOException e)
      {
        System.err.println("ERROR: Bad input");
      }

      switch (menuInput) {
        case "1":
          try
          {
            pupilService.getAll().forEach(System.out::println);
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
          break;
        case "2":
          try
          {
            PupilForm form = getPupilFormFromConsole();
            pupilService.saveNewPupil(form);
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
          deletePupil();
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

  private void deletePupil()
  {
    System.out.println("Enter name:");
    try
    {
      String name = ioService.getString();
      pupilService.deletePupilByName(name);
    }
    catch (IOException e)
    {
      System.err.println("Bad input");
    }
    catch (NoSuchPupilException e)
    {
      System.err.println("No such pupil: " + e.getMessage());
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }

  private PupilForm getPupilFormFromConsole() throws IOException, NumberFormatException
  {

    System.out.println("Enter name:");
    String name = ioService.getString();
    System.out.println("Enter age:");
    int age = ioService.getInt();

    return new PupilForm(name, age);
  }
}
