package hw.hw6.task1;

public abstract class Pet implements Playable{

  private String name;

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
