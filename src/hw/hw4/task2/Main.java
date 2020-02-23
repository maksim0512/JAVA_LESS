package hw.hw4.task2;

public class Main {

  public static void main(String[] args) {

    Player player1 = new Player("Vasily");
    Player player2 = new Player("Ignat", 10, 0);

    player1.move(3, 4);
    player2.move(0, 0);

    player1.printInfo();
    player2.printInfo();

    player1.move(-3, -4);

    player1.printInfo();
  }
}
