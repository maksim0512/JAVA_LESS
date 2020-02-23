package hw.hw6.task4;

public class Rectangular implements Figure {

  private double x1, x2;

  public Rectangular(double x1, double x2) {
    this.x1 = x1;
    this.x2 = x2;
  }

  @Override
  public double getPerimeter() {
    return (x1 + x2) * 2;
  }

  @Override
  public double getSquare() {
    return x1 * x2;
  }

  public double getX1() {
    return x1;
  }

  public double getX2() {
    return x2;
  }
}
