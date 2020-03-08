package lessons.lesson12.streamAPIexample;

import java.util.function.Predicate;

public class CustomPredicate implements Predicate<String> {

  @Override
  public boolean test(String s) {
    return s.length() <= 5;
  }
}
