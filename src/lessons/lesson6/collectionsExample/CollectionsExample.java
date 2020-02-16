package lessons.lesson6.collectionsExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(20);
    list.add(-11);
    list.add(1);
    list.add(-11);
    System.out.println(list);

    list.add(1, 10);
    System.out.println(list);

    System.out.println(list.size());

    System.out.println(list.get(2));

    System.out.println(list.contains(1));
    System.out.println(list.indexOf(-11));
    System.out.println(list.lastIndexOf(-11));
    list.set(0, 100);
    System.out.println(list);

    list.sort(Comparator.reverseOrder());
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
    for (Integer i : list) {
      System.out.print(i + " ");
    }

    list.forEach(System.out::println);
  }
}
