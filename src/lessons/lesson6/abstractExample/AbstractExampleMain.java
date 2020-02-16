package lessons.lesson6.abstractExample;

public class AbstractExampleMain {

  public static void main(String[] args) {

//    Person person1 = new Person("Vasily", 25);

    Person worker1 = new Worker("Vasily", 25, "MAZ");

    worker1.doWork();
    Workable.printName("abc");

    System.out.println(worker1.objToString());


  }
}
