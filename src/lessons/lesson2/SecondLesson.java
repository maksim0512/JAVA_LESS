package by.belhard.j20.lessons.lesson2;

import java.sql.SQLOutput;

public class SecondLesson
{
    public static void main(String[] args)
    {
        byte b1;
        b1 = 127;
        byte b2 = 2;
        //byte b3=(b1+b2);//так нельзя
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
        ////////////
        long l1 = 25000000000L;//без L будет тип int
        float f1 = 2.1f;// явно указываем в конце числа f
        /////////////
        char c1 = 'A';
        char c2 = 99;//при выводе будет буква, соответствующая коду числа (с=99)
        System.out.println(c1);
        System.out.println(c2);
        //System.out.print();//без ln - нет перевода каретки - в одну строку

        /////////////////////////////////
        int a= 1;
        System.out.println(a++);
        System.out.println(a);

    }
}
