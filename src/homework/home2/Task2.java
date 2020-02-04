package homework.home2;

public class Task2
{
    public static void main(String[] args)
    {
        //Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.
        //*доп.Посчитать и вывести медиану Медиана (вики). (т.е. у сортированного массива: (значение среднего элемента - значение элемента перед ним) / 2)

        int[] array = new int[10];//Объявляем массив

        //Заполняем массив
        for(int i = 0; i<array.length; i++)
        {
            array[i] = (i+1)*2;
            //System.out.println(array[i]);
            System.out.print( array[i] + " ");
        }
        System.out.println();//Пробел

        int summa = 0;
        double srednee = 0;
        for(int i = 0; i<array.length; i++)
        {
            summa += array[i];
        }
        srednee = (double)(summa/array.length);//Среднее=сумма/кол-во элементов
        System.out.println("Сумма значений массива = " + summa);
        System.out.println("Среднее значение массива = " + srednee);

        ////////////////////////
        //доп1
        //Посчитать и вывести медиану Медиана (вики). (т.е. у сортированного массива: (значение среднего элемента - значение элемента перед ним) / 2)
        double mediana = 0;
        //цикл поиска медианы
        if (array.length %2 == 0)
        {
            mediana = ((array[array.length/2] + array[array.length/2-1])/2f);
        }
        else
        {
            mediana = array[array.length/2];
        }
        System.out.println("Медиана  массива = " + mediana);


    }
}
