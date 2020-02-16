package homework.home4.Task4;

public class Rectangle extends Square //класс Rectangle наследует класс-родитель Square
{

    private int lenghtside;//длина


    //Конструктор
    public Rectangle(int width, int lenghtside)
    {
        super(width);//принимает поле width класса-родителя Square (возврат через слово super)

        this.lenghtside = lenghtside;//принимает свое поле lenghtside - длина
    }

    public int getLenghtside() {
        return lenghtside;
    }

    public void setLenghtside(int lenghtside)
    {
        this.lenghtside = lenghtside;
    }

    //Переопределенный метод area класса-родителя Square
    @Override
    public double area(int a)
    {
        //Своя реализация
        //Ограничения: возврат и тип переменной возврата - одинаковы (нельзя void, если в родителе есть возврат)
        //: принимаемые переменные и их тип - одинаковы (нельзя не принимать/или разное ко-во)
        return super.getWidth() * a;
    }

    //Переопределенный метод perimeter класса-родителя Square
    @Override
    public double perimeter(int a)
    {
        //Своя реализация
        //Ограничения: возврат и тип переменной возврата - одинаковы (нельзя void, если в родителе есть возврат)
        //: принимаемые переменные и их тип - одинаковы (нельзя не принимать/или разное ко-во)
        return (2 * super.getWidth()) + (2 * a);
    }
}
