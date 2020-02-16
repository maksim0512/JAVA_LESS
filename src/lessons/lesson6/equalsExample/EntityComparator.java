package lessons.lesson6.equalsExample;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {

  @Override
  public int compare(Entity o1, Entity o2) {

    return o1.compareTo(o2);
  }
}
