package lessons.lesson4.lesson41.objectsExamples;

import java.util.Date;

public class PersonExample {

  public static void main(String[] args) {

    Person person1 = new Person("Alfredo", 25, new Country("Brazil", 123456), Sex.MALE);
    Person person2 = new Person("Gustavo", person1.getCountry());
//    person1.age = 5;
//    person1.name = "";
//    person1.setName("Alfredo");


    System.out.println(person1.getName());
    System.out.println(person2.getCountry().getTitle());

    System.out.println();

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.getCountry());
    System.out.println(person2.getCountry());

    System.out.println(Country.capitalize(person1.getCountry().getTitle()));

    System.out.println(Integer.parseInt("13") * 10);
    System.out.println(Double.parseDouble("13.1") * 10);


  }
}
