package homework.home3;

public class Player
{
/*    2. Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):
    а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
    б) вывести на консоль значение текущего положения,
    доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.*/

    static int X;//координата X
    static int Y;//координата y

    //а) метод перемещения в новые координаты
    public static void move (int a, int b)
    {
        X=a;//координата X станет равна переданной a
        Y=b;//координата Y станет равна переданной b
    }

    //доп1 Значение пройденного расстояния
    public static void dlina(int a, int b)
    {
        int dlinaX=a-X;
        int dlinaY=b-Y;

        System.out.println("Расстояние по X = "  + dlinaX + ";  Расстояние по y = " + dlinaY);
    }


    public static void main(String[] args)
    {
        //б) передаем в метод move новые координаты и выводим на консоль

        X=5;//первоначальная координата X
        Y=3;//первоначальная координата Y
        System.out.println("Перемещение в новые координаты");
        System.out.println("Начальная координата X = "  + X + ";  Начальная координата Y = " + Y);

        move(2,1);//передали в метод move в классе Player измененнные координаты
        System.out.println("Измененная координата X = "  + X + ";  Измененная координата Y = " + Y);

        //доп1
        System.out.println();
        System.out.println("Длина пути");

        X=5;//первоначальная координата X
        Y=3;//первоначальная координата Y
        System.out.println("Начальная координата X = "  + X + ";  Начальная координата Y = " + Y);
        dlina(8,5);//передали в метод dlina в классе Player измененнные координаты

    }
}



