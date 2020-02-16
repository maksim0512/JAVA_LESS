package lessons.lesson5.Task1;

public class Wardrobe {

  private final int shelves;

  private final String[] items;

  public Wardrobe(int shelves) {
    if (shelves < 1)
      shelves = 3;

    this.shelves = shelves;
    this.items = new String[shelves];
  }

  public void printInfo() {
    System.out.println("== WARDROBE ==");
    for (int i = 1; i <= shelves; i++) {
      System.out.printf("%d) %s\n", i, items[i - 1]);
    }
    System.out.println("==============\n");
  }

  public String getItem(int n) {

    if (n <= 0 || n > shelves) {
      System.err.println("BAD INPUT");
      return null;
    }

    String result = null;
    if (items[n - 1] == null)
      System.out.printf("Shelf number %d is empty!\n", n);
    else {
      result = items[n - 1];
      items[n - 1] = null;
    }

    return result;
  }

  public String getRandomItem() {

    String result;
    for (int i = 0; i < shelves; i++) {
      if (items[i] != null) {
        result = items[i];
        items[i] = null;
        System.out.printf("Take item %s from shelf number %d\n~", result, i + 1);
        return result;
      }
    }

    System.out.println("Wardrobe is empty!");
    return null;
  }

  public void setItemToShelf(String item, int n) {
    if (n <= 0 || n > shelves) {
      System.err.println("BAD INPUT");
      return;
    }

    if (items[n - 1] != null) {
      System.err.println("Shelf is not empty!");
      return;
    }

    items[n - 1] = item;
  }

  /*public void throwItemInto(String item) {


  }*/

}
