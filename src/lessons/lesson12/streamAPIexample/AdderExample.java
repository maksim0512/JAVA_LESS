package lessons.lesson12.streamAPIexample;

@SuppressWarnings("all")
public class AdderExample {

  private static IntFunction plus = (a1, a2) -> a1 + a2;
  private static IntFunction minus = (a1, a2) -> a1 - a2;

  public static void main(String[] args) {

    System.out.println(doSomething(1, 2, "plus"));
    System.out.println(doSomething(10, 5, "minus"));
  }

  public static int doSomething(int a, int b, String operation) {

    IntFunction oper = null;

    switch (operation) {
      case "plus":
        oper = plus;
        break;
      case "minus":
        oper = minus;
        break;
    }

    return oper.proceed(a, b);
  }
}
