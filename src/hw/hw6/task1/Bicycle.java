package hw.hw6.task1;

public class Bicycle implements Playable {

  @Override
  public void play() {
    System.out.println("ring-ring");
  }

  @Override
  public String getName() {
    return "Bicycle";
  }
}
