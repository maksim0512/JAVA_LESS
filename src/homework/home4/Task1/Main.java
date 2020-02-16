package homework.home4.Task1;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("Котик");

        String mypet = person.getPet();//Получить имя питомца

        //Результат работы метода
        String play = person.play(mypet);

        System.out.println(play);
    }
}
