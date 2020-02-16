package homework.home4.Task2;


import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        //////////////
        //Записать в список 5 экземпляров класса Person

        //Создаем экземпляр класса ArrayPerson, в котором объявлен список List классов Person
        ArrayPerson arrayPerson = new ArrayPerson();

        //persons - поле класса ArrayPerson (представляющее список классов)
        //добавляем в список классы Person

        arrayPerson.persons.add(new Person("Anton"));
        arrayPerson.persons.add(new Person("Vasiliy"));
        arrayPerson.persons.add(new Person("Maria"));
        arrayPerson.persons.add(new Person("Lubov"));
        arrayPerson.persons.add(new Person("Alex"));



        //Вызываем метод ArrayPerson и передаем имя
        Person personText = arrayPerson.RetPerson("Lubov");

        //Вызываем метод toString
        System.out.print(personText + " ");

    }
}
