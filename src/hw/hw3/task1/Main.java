package hw.hw3.task1;

public class Main {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      if (i / 10 % 2 != 0)
        if (i % 5 == 0 ^ i % 7 == 0)
          System.out.print(i + " ");
    }
  }
}
