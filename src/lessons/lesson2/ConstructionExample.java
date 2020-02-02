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

    }
}
