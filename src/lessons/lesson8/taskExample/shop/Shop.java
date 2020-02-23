package lessons.lesson8.taskExample.shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Shop
{

  private final Map<String, Integer> assortment = new HashMap<>();
  private final Kassa kassa = new Kassa(assortment);

  public Shop()
  {
    initAssortment();
  }

  private void initAssortment() {

    try (BufferedReader rdr = new BufferedReader(new FileReader("input.tt"))) {

      String[] line;

      while (rdr.ready())
      {

        line = rdr.readLine().split(" ");
        assortment.put(line[0], Integer.parseInt(line[1]));
      }

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void startBuying()
  {
    kassa.start();
  }
}
