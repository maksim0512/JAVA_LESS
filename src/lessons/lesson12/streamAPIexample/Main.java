package lessons.lesson12.streamAPIexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

  @SuppressWarnings("all")
  public static void main(String[] args) {

    /*
    List<String> listEmpty = new ArrayList<>();
    Optional<String> any = listEmpty.stream().findAny();
    if (any.isPresent()) {
      String s = any.get();
      System.out.println("object: " + s);
    } else {
      System.err.println("empty object");
    }*/

    List<String> list = new ArrayList<>();

    list.add("abc");
    list.add("abcqwe");
    list.add("abc.2");
    list.add("abcfff232");
    list.add("abcr32r");
    list.add("a");

    /**new Predicate<String>() {
    @Override public boolean test(String s) {
    return s.length() <= 5;
    }
    }*/
    List<String> collect = list.stream()
        .filter(s -> s.length() <= 5)
//        .map(String::toUpperCase)
        .map(s -> s.toUpperCase())
        .sorted((s1, s2) -> s1.compareTo(s2))
        .collect(Collectors.toList());

    System.out.println(list);
    System.out.println(collect);

    String collectString = collect
        .stream()
        .map(s -> {
          System.out.println(s);
          return s;
        })
        .collect(Collectors.joining(", ", "-=[", "]=-"));

    System.out.println(collectString);


  }
}














