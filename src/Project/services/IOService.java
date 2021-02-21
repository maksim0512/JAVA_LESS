package Project.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOService
{

  public static final String EXIT_CHAR = "e";
  private static final String MENU_LEGEND =
          "1. Print all assortment\n" +
          "2. Add new product\n" +
          "3. Delete product by name\n" +
          "4. Print customers\n" +
          "5. Print basket all customers\n" +
          "6. Print basket customer\n" +
          "7. Add products in basket\n" +
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
