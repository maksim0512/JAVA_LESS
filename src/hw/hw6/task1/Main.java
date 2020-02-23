package hw.hw6.task1;

public class Main {

  public static void main(String[] args) {

    Playable cat1 = new Cat("Vasily");
    Playable dog1 = new Dog("Polkan");

    Master master = new Master("Ruslan", cat1);

    master.playWithPet(dog1);
    master.playWithOwnPet();

    Master master2 = new Master("Shon", new Bicycle());
    System.out.println();
    master2.playWithOwnPet();
    master.playWithPet(master2.getPet());
  }
}
