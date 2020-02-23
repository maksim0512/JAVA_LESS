package homework.home5.Task1;

import java.io.*;

public class ConsoleRead
{
    public static void main(String[] args)
    {
        Read();//Чтение с консоли и Запись в файл
        Write();//Чтение с файла и запись в другой файл

    }


    public static void Read()
    {
        //Считываем данные с консоли и записываем в файл:

        try
        {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

            File file = new File("Home5Task1Write.txt");
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit"))//Пока не напишем слово exit
            {
                bufferedWriter.write(line);
                bufferedWriter.append(" ");//добавляем пробел
            }

            bufferedWriter.flush();// передать данные из буфера во Writer

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close(); // закрываем поток
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public static void Write()
    {
        try
        {
            //BufferedReader для чтения из файла
            File file1 = new File("Home5Task1Write.txt");
            FileReader filereader = new FileReader(file1);// поток для чтения, который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(filereader);


            //BufferedWriter для записи в файл
            File file2 = new File("Home5Task1Write1.txt");
            FileWriter fileWriter = new FileWriter(file2); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter


            String[] line;//объявляем массив строк
            while (bufferedReader.ready())
            {
                line = bufferedReader.readLine().split(" ");//Считываем число до пробела
                String toWrite = ThreeString(line);//Передаем в метод (получаем число в кубе)

                bufferedWriter.write(toWrite);//записываем результат возведения в куб в bufferedWriter
                bufferedWriter.append(" ");//добавляем пробел
                bufferedWriter.flush();// передать данные из буфера во Writer
            }

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close(); // закрываем поток
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public static String ThreeString(String[] line)
    {

        StringBuilder sb = new StringBuilder();

        for (String s : line)
        {
            try
            {
                int number = Integer.parseInt(s);
                sb.append(number * number * number);
            }
            catch (NumberFormatException e)
            {
                sb.append(s);
            }
            finally
            {
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }




}
