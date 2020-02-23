package lessons.lesson7.exceptions;

public class Main {

  public static void main(String[] args) {

    ExceptionExample exceptionExample = new ExceptionExample();

    int res = 0;

    try
    {
      res = exceptionExample.div(5, 0);
    }
    catch (ArithmeticException e)
    {
      System.err.println("ERROR");
      System.err.println(e.getMessage());
      res = 100;
    }

    System.out.println(res);
  }
}
