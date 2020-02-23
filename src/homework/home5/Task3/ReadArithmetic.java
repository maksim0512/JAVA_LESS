package homework.home5.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadArithmetic
{
    public static void main(String[] args)
    {
        Start();//Чтение с консоли
    }


    public static void Start()
    {
        //Считываем данные с консоли:

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
        {
            //InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader


            String line;//объявляем строку

            while (!(line = bufferedReader.readLine()).equals("exit"))//считываем с консоли пока не ввели слово exit
            {
                line = bufferedReader.readLine().replaceAll(" ", "");//удаляем пробелы из строки

                //Не знаю как выполнить арифметическую операцию над числами в принятой строке

                //System.out.println("Total sum: " + total + " r.");

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
