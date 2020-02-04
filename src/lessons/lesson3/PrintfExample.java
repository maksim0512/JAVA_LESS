package lessons.lesson3;

public class PrintfExample
{
    public static void main(String[] args)
    {
        String name = "Maksim";
        System.out.printf("I am %d years old. My name is %10.3s.", 30, name);
        System.out.println();

        ///////////////////////
        int n = 3;
        int qap = n-1;
        String result = "";
        for(int i=1; i<=n; i++)
        {
            result = "";

            for(int g=0; g<qap; g++)
            {
                result += " ";
            }
            for(int j=0; j<i; j++)
            {
                result += i + "";
            }
            System.out.println(result);
            qap--;
        }


    }

}
