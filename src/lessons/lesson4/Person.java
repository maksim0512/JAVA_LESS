package lessons.lesson4;

public class Person
{
    ///////Константы
    private static final String DEFAULT_NAME = "Vasiliy";
    //Поля класса
    private String name;
    private int age;
    private Country country;//Класс
    private Sex sex;//Enum класс -константы (перечисления)//Константы (через запятую)


    ///////Конструкторы
    public Person(String name, int age, Country country, Sex sex)
    {
    this.name = name;
    this.age = age;
    this.country = country;
    this.sex = sex;
    }

    public Person(String name, Country country)
    {
        this.name = name;
        this.age = 18;
        this.country = country;
        this.sex = Sex.MALE;
    }

    ///////Методы
    public void walk()
    {
        System.out.println(name + "is walking");
    }
    //Перегруженый метод
    public void walk(int time)
    {
        System.out.println(name + "is walking" + time + "minutes");
    }



    public void eat(String dish)
    {
        System.out.printf("%s is eating %s,  Om-nom-nom!", name, dish);
    }

    public int growOld()
    {
        return ++age;
    }

    ////////////Getter (аналог свойства в C#)
    public String getName()//Getter (аналог свойства в C#)
    {
        return name;
    }
    //Setter (аналог свойства в C#)
    public void setName(String name)//Setter (аналог свойства в C#)
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }
}
