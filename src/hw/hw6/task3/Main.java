package hw.hw6.task3;

import java.util.Map;

public class Main {

  public static void main(String[] args) {

    String inputString = "Mama, myla ramu!";

    Map<Character, Integer> map = CharacterMap.countCharacters(inputString);

    map.forEach((k, v) -> System.out.println(k + " : " + v));

  }
}
