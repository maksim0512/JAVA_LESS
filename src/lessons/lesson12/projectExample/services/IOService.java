package lessons.lesson12.projectExample.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOService {

  public static final String EXIT_CHAR = "e";
  private static final String MENU_LEGEND =
          "1. Print all pupils\n" +
          "2. Add new pupil\n" +
          "3. Delete pupil by name\n" +
          EXIT_CHAR + ". exit\n";

  private BufferedReader rdr;

  public IOService()
  {
    this.rdr = new BufferedReader(new InputStreamReader(System.in));
  }

  public String getString() throws IOException
  {
    return rdr.readLine();
  }

  public int getInt() throws IOException, NumberFormatException
  {
    return Integer.parseInt(getString());
  }

  public void printLegend()
  {
    System.out.println(MENU_LEGEND);
  }
}
