package homework.home4.Task2;

import java.util.List;//добавляем библиотеку класса

public class ArrayPerson
{
    //создать поле List<Person> persons (список классов Person)

    List<Person> persons;


    //метод, который будет принимать параметр String name и возвращать из списка объект Person
    //с таким именем (либо null, если человека с таким именем нет в списке)
    public Person RetPerson(String name)
    {
        for (int i = 0; i < persons.size(); i++)
        {
            if (persons.get(i).getName() == name)
            {
                return persons.get(i);
            }
        }
        return null;
    }




    //Возврат списка List<Person> (для себя)
    /*public List<Person> RetPerson(String name)
    {
        for (int i = 0; i < persons.size(); i++)
        {
            if (persons.get(i).getName() == name)
            {
                return persons;
            }
        }
        return null;
    }*/


}


