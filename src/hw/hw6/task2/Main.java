package hw.hw6.task2;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    PersonsHandler personsHandler = new PersonsHandler();

    personsHandler.addPerson(new Person("Vasily", 1), new Person("Olga", 1), new Person("Ignat", 1));
    personsHandler.addPerson();
    personsHandler.addPerson(new Person("Jack", 1));
    personsHandler.addPerson(new Person("Olga", 2), new Person("Jack", 2), new Person("Jack", 3));

    Person olga = personsHandler.getFirstPersonByName("Olga");
    List<Person> jack = personsHandler.getAllPersonsByName("Jack");

    System.out.println(olga);
    System.out.println(jack);
  }
}
