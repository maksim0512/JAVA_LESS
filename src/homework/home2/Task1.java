package homework.home2;

public class Task1
{
    public static void main(String[] args)
    {
        //1.	Вывести в строку через пробел все числа от 1 до 100 (включая обе границы),
        // которые делятся без остатка на 3 и на 7 одновременно
        for(int i=1; i<=100; i++)
        {
            if(i%3 == 0 && i%7 == 0)
            {
                System.out.print( i + " ");
            }
        }
        System.out.println();//пробел
        System.out.println();//пробел

        ////////////////////
        //доп1
        //Вывести в строку через пробел все числа от 1 до 100, которые делятся без остатка
        // либо на 5, либо на 7, но не одновременно на 5 и на 7
        for(int i=1; i<=100; i++)
        {
            if(i%5 == 0 || i%7 == 0)
            {
                if(i%5 == 0 && i%7 == 0)
                {
                    continue;
                }
                System.out.print( i + " ");
            }
        }
        System.out.println();//пробел
        System.out.println();//пробел

        ////////////////////////
        //доп2
        //Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99],которые
        // делятся либо на 5, либо на 7, но не одновременно на 5 ина 7
        for(int i=10; i<=19; i++)
        {
            ostatok(i);
        }
        System.out.println();//пробел
        for(int i=30; i<=39; i++)
        {
            ostatok(i);
        }
        System.out.println();//пробел
        for(int i=50; i<=59; i++)
        {
            ostatok(i);
        }
        System.out.println();//пробел
        for(int i=70; i<=79; i++)
        {
            ostatok(i);
        }
        System.out.println();//пробел
        for(int i=90; i<=99; i++)
        {
            ostatok(i);
        }




    }

    public static void ostatok(int i)
    {
        if(i%5 == 0 || i%7 == 0)
        {
            if(i%5 == 0 && i%7 == 0)
            {
                return;
            }
            System.out.print( i + " ");
        }
    }

}
