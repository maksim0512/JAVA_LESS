package hw.hw6.task1;

public class Dog extends Pet {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println(this.getName() + " plays: \"Woof-Woof\"");
  }
}
