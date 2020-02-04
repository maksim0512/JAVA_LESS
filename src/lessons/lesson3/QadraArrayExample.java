package lessons.lesson3;

public class QadraArrayExample
{
    public static void main(String[] args)
    {
        int [][] array = new int [3][];//двумерный массив

        array[0] = new int[3];//первый элемент имеет 3 элемента
        array[1] = new int[2];
        array[2] = new int[1];

        byte[][] arrayBytes = {{1,2,3}, {4,5,6}}; // инициализация
        System.out.println(arrayBytes[1][2]);

        //////////
        int [][] multiTable = new int [8][8];
        for(int i=2; i<=9; i++)
        {
            for(int j=2; j<=9; j++)
            {
                multiTable[i-2][j-2] = i * j;
            }
        }

        for(int[] innerArray : multiTable)
        {
            for (int i : multiTable[0])
            {
                System.out.print( i + "");
            }
            System.out.println();
        }

        for(int i = 0; i<multiTable.length; i++)
        {
            for(int j = 0; j<multiTable[i].length; j++)
            {
                System.out.print(multiTable[i][j] + "");
            }
            System.out.println();
        }

        /////////////////////
        String[] strArray = {"abc", "absg", "afu", "hdd", "adsrsf", "hhhh",};
        String result = "";

        for (String s : strArray)
        {
            if(s.length() <= 3)
            {
                result += s + "|";
            }
        }
        System.out.println(result);

    }
}
