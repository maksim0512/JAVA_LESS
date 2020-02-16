package lessons.lesson6.collectionsExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
  public static void main(String[] args) {

    Map<String, Value> map = new HashMap<>();

    map.put("val1", new Value("value1"));
    map.put("val2", new Value("value2"));
    map.put("val3", new Value("value3"));

    System.out.println(map.toString());

    System.out.println(map.get("val2"));

    Collection<Value> values = map.values();

    Set<String> keys = map.keySet();

    map.put("val1", new Value("value1updated"));
    System.out.println(map.toString());

    System.out.println(map.containsKey("key3"));
    System.out.println(map.containsKey("val3"));

    System.out.println();
    for (Map.Entry<String, Value> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
