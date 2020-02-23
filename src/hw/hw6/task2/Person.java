package hw.hw6.task2;

public class Person {

  private final String name;

  private final int number;

  public Person(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", number=" + number +
        '}';
  }
}
