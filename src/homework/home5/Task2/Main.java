package homework.home5.Task2;

import java.io.*;

public class Main
{

    private static int total = 0;//стоимость всех товаров;


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

            String[] line = bufferedReader.readLine().split(" ");//Объявляем массив строк и Считываем построчно первую строку

            int number = Integer.parseInt(line[0]);//запоминаем число строк, которые нужно считать с консоли

            int i = 1;//счетчик строк


            while (i <= number)//пока i меньше числа строк, которые нужно принять с консоли
            {
                line = bufferedReader.readLine().split(" ");

                total += (Integer.parseInt(line[1]) * Integer.parseInt(line[2]));

                i++;//увеличиваем счетчик
            }

            System.out.println("Total sum: " + total + " r.");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }




}
