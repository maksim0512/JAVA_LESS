package lessons.lesson5.Task2;

public class Main {

  public static void main(String[] args) {

    Person person1 = new Person("Vasily", 25);
    person1.doWork();
    System.out.println(person1.growOld());

    Worker worker1 = new Worker("Roman", 55, "MTZ");
    System.out.println(worker1.getFactoryName());
    worker1.doWork();

    Person person2 = worker1;
    person2.doWork();

    Person person3 = new Worker("Gennady", 30, "MAZ");
    person3.doWork();
    person3.growOld();
    System.out.println(((Worker) person3).getFactoryName());

    Person[] persons = new Person[3];

    persons[0] = worker1;
    persons[1] = person3;
    persons[2] = new Manager("Romuald", 21, 12345);

    if (persons[0] instanceof Manager)
      ((Manager) persons[0]).getPhoneNumber();

    System.out.println("END");
  }
}
