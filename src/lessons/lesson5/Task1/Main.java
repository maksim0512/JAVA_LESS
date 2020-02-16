package lessons.lesson5.Task1;

public class Main {

  public static void main(String[] args) {

    Wardrobe wardrobe = new Wardrobe(4);

    wardrobe.printInfo();

    wardrobe.setItemToShelf("Jacket", 2);
    wardrobe.setItemToShelf("Hat", 3);
    wardrobe.printInfo();

    String item = wardrobe.getItem(4);
    System.out.println(item);

    String randomItem = wardrobe.getRandomItem();
    System.out.println(randomItem);

    wardrobe.printInfo();
  }
}
