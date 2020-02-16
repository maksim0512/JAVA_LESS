package lessons.lesson6.equalsExample;

public class EqualsExample {

  public static void main(String[] args) {

    Entity entity1 = new Entity(10, "abc");
    Entity entity2 = new Entity(10, "abd");
    Entity entity3 = entity1;

    System.out.println("entity1 == entity2 : " + (entity1 == entity2));
    System.out.println("entity1 == entity3 : " + (entity1 == entity3));
    System.out.println();
    System.out.println("entity1.equals(entity2) : " + entity1.equals(entity2));
    System.out.println("entity1.equals(entity3) : " + entity1.equals(entity3));
    System.out.println();
    System.out.println(entity1.hashCode());
    System.out.println(Integer.toHexString(entity1.hashCode()));
    System.out.println(entity2.hashCode());
    System.out.println(entity3.hashCode());
    System.out.println();
    System.out.println(entity1.compareTo(entity2));
    System.out.println(entity1.compareTo(entity3));
    System.out.println();
    EntityComparator comparator = new EntityComparator();
    System.out.println(comparator.compare(entity1, entity2));


  }
}
