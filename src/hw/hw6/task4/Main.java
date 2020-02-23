package hw.hw6.task4;

public class Main {

  public static void main(String[] args) {

    Figure rect1 = new Rectangular(5, 10);
    Figure circle1 = new Circle(10);
    Figure square1 = new Square(3);

    System.out.println("Rectangular 5 10");
    System.out.println(CalculationUtils.getPerimeter(rect1));
    System.out.println(CalculationUtils.getSquare(rect1));
    System.out.println("Circle 10");
    System.out.println(CalculationUtils.getPerimeter(circle1));
    System.out.println(CalculationUtils.getSquare(circle1));
    System.out.println("Square 3");
    System.out.println(CalculationUtils.getPerimeter(square1));
    System.out.println(CalculationUtils.getSquare(square1));

  }
}
