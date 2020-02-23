package hw.hw6.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonsHandler {

  private final List<Person> personList = new ArrayList<>();

  public void addPerson(Person... person) {
    personList.addAll(Arrays.asList(person));
  }

  public Person getFirstPersonByName(String name) {

    for (Person person : personList) {
      if (person.getName().equals(name))
        return person;
    }

    return null;
  }

  public List<Person> getAllPersonsByName(String name) {

    List<Person> result = new ArrayList<>();

    for (Person person : personList)
      if (person.getName().equals(name))
        result.add(person);

    return result;
  }

}
