package lessons.lesson7.strings;

public class StringsExample {

  public static void main(String[] args) {

    String string1 = "abc";
    String string2 = "abc";
    String string3 = new String("abc");


    System.out.println(string1.equals(string2));
    System.out.println(string1 == string2);
    System.out.println();
    System.out.println(string1.equals(string3));
    System.out.println(string1 == string3);
    System.out.println();

    StringBuilder sb1 = new StringBuilder();
    for (int i = 0; i < 10; i += 2) {
      sb1.append(i).append(" ");
    }
    String s = sb1.reverse().toString();
    System.out.println(s);

    String s1 = s.replaceAll("\\s", "-");
    System.out.println(s1);

  }
}
