package hw.hw6.task4;

public class Circle implements Figure {

  private double r;

  public Circle(double r) {
    this.r = r;
  }

  public double getR() {
    return r;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * r;
  }

  @Override
  public double getSquare() {
    return Math.PI * r * r;
  }
}
