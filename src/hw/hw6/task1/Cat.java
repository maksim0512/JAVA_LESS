package hw.hw6.task1;

public class Cat extends Pet {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println(this.getName() + " plays: \"Meow\"");
  }
}
