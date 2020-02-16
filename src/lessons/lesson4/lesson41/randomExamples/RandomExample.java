package lessons.lesson4.lesson41.randomExamples;

import java.util.Random;

public class RandomExample {

  public static void main(String[] args) {

    Random random = new Random();

    System.out.println(random.nextInt());
    System.out.println(random.nextInt(50));

    int lowerBound = 20;
    int higherBound = 30;

    System.out.println((random.nextInt(higherBound - lowerBound + 1) + lowerBound));

    System.out.println();

    System.out.println(Math.random());
  }
}
