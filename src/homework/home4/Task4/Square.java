package homework.home4.Task4;

public class Square
{
    private int width;//ширина

    //Конструктор
    public Square(int width)
    {
        this.width = width;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    //Площадь
    public double area(int a)
    {
        return a*a;//Площадь квадрата
    }


    //Периметр
    public double perimeter(int a)
    {
        return a*4;//Периметр квадрата
    }


}
