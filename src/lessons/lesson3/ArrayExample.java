package lessons.lesson3;

public class ArrayExample
{
    public static void main(String[] args)
    {
       int[] array = new int[3];
       array[0]= 1;
        array[1]= 22;
        array[2]= 35;

        System.out.println(array[2]);

        for(int i = 0; i<array.length; i++)
        {
            array[i] = i*2;
        }
        System.out.println("123");

        for(int i = 0; i<array.length; i++)
        {
            array[i] = i*2;
            System.out.println(array[i]);
        }
        ////////////////////////////////
        //Массив String
        //String[] stringArray = new String[] {"one", "two", "three", "four", "five", "six"};
        String[] stringArray =  {"one", "two", "three", "four", "five", "six"};// можно так записать

        for(String s: stringArray)
        {
            if(s.equals("three"))// Не выводим three
            {
                continue;
            }
            System.out.println(s);
        }

    }
}
