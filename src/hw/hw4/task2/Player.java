package hw.hw4.task2;

public class Player {

  private String name;

  private double x, y;

  private double distance;

  public Player(String name) {
    this(name, 0, 0);
  }

  public Player(String name, double x, double y)   {
    this.name = name;
    this.x = x;
    this.y = y;
    this.distance = 0;
  }

  public void move(double x, double y) {

    double delta = distance(x, y);
    distance += delta;
    this.x = x;
    this.y = y;
  }

  public void printInfo() {

    System.out.printf("%s [%.2f:%.2f] - distance: %.2f\n", name, x, y, distance);
  }

  private double distance(double x, double y) {

    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  //

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getDistance() {
    return distance;
  }

}
