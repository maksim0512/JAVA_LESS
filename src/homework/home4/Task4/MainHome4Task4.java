package homework.home4.Task4;


public class MainHome4Task4
{
    public static void main(String[] args)
    {
        //Класс-родитель
        Square square = new Square(4);

        double areasq = square.area(square.getWidth());
        System.out.println("Площадь квадрата = " + areasq);

        double persqa = square.perimeter(square.getWidth());
        System.out.println("Периметр квадрата = " + persqa);

        /////////////
        //Создаем объект класса Rectangle по ссылке класса-родителя Square
        Square rectangle = new Rectangle(square.getWidth(), 2);

        //Передаем в переопределенный метод Длину (а ширина берется в методе из класса-родителя)
        double arearec = rectangle.area(2);
        System.out.println("Площадь прямоугольника = " + arearec);

        //Передаем в переопределенный метод Длину (а ширина берется в методе из класса-родителя)
        double perrec = rectangle.perimeter(2);
        System.out.println("Периметр прямоугольника = " + perrec);

        ///////////////
        //Создаем объект класса Circle по ссылке класса-родителя Square
        Square circle = new Circle(3);

        //Передаем в переопределенный метод Радиус (в конструкторе Circle радиус = полю класса-родителя)
        double areacircle = circle.area(square.getWidth());
        System.out.println("Площадь круга = " + areacircle);

        double percircle = circle.perimeter(square.getWidth());
        System.out.println("Периметр круга = " + percircle);


    }

}
