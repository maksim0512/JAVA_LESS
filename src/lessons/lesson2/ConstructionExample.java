package by.belhard.j20.lessons.lesson2;

public class ConstructionExample
{
    public static void main(String[] args)
    {
        int a = 5;
        if(a>=5)
        {
            System.out.println("a is greater then 5");
        }
        else if(a<5)
        {
            System.out.println("a = " +a);
        }

        /////////////////
        int q=5;
        int w=80;
        double e=3.5;
        System.out.println(q+w+e+ "qwe");

        int b=0;
        for(int i = 10; i>0;i-=2)//i-2
        {
            System.out.println(i+" ");
            b=i;
        }
        System.out.println("\n\n" +b);

        ////////////////
        int k=4;
        String p;
        switch(k)
        {
            case 1:
                p = "Monday";
                break;
            case 2:
                p = "Tuesday";
                break;
            case 3:
                p = "Wednesday";
                break;
            case 4:
                p = "Thursday";
                break;
            case 5:
                p = "Friday";
                break;
            case 6:// Если закоменчено - то на 6 и 7 одинаковый вывод
                //result = "Weekend";
                //break;
            case 7:
                p = "Weekend";
                break;
            default:
                p = "bad input";
                break;
        }

        ////////////////////////////////


    }

}


