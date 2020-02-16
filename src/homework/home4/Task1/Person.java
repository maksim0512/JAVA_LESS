package homework.home4.Task1;

public class Person
{
    private String pet;//питомец

    //Конструктор
    public Person(String pet) {
        this.pet = pet;
    }

    //Получаем наименование питомца
    public String getPet() {
        return pet;
    }

    //Метод игры c питомцем
    public String play(String pet)
    {
        if(pet == "Котик")
        {
            return "Мяу-мяу";
        }
        else if(pet == "Собачка")
        {
            return "Гав-гав и прыжок";
        }
        else if(pet == "Рыбка")
        {
            return "Плавает по кругу";
        }

        return "Нет такого питомца";
    }

}








