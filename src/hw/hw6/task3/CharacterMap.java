package hw.hw6.task3;

import java.util.HashMap;
import java.util.Map;

public class CharacterMap {

  private static final String CHARACTERS = "[.,!-:?{}()*+=]";

  public static Map<Character, Integer> countCharacters(String inputString) {

    Map<Character, Integer> result = new HashMap<>();

    char[] chars = inputString.toLowerCase().toCharArray();

    for (char c : chars) {
      if (CHARACTERS.contains(c + ""))
        c = '*';

      if (!result.containsKey(c)) {
        result.put(c, 1);
      } else {
        result.put(c, result.get(c) + 1);
      }
    }

    return result;
  }
}
