package lessons.lesson11.Lesson11_Prep.jdbcExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

  public static void main(String[] args) {

    Collection<String> list = new ArrayList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    Iterator<String> iterator = list.iterator();

    /*for (String s : list) {
      if (s.equals("two"))
        list.remove(s);
    }*/

    while (iterator.hasNext()) {
      String next = iterator.next();
      System.out.println(next);
      if (next.equals("two"))
        iterator.remove();
    }

    System.out.println(list);
  }
}
