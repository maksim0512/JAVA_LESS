package lessons.lesson7.exceptions;

public class ExceptionExample {

  public int div(int a, int b) {

    int result = 0;

    result = a / b;
    /*try
    {
      result = a / b;
    }
    catch (ArithmeticException e)
    {
      e.printStackTrace();
    }
    catch (Exception e)
    {
      System.err.println();
    }*/

    return result;
  }
}
