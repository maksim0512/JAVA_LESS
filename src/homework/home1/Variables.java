package by.belhard.j20.homeworks.home1;

public class Variables
{
    public static void main(String[] args)
    {
        //1 задание
        byte b = 42;
        System.out.println(b*3);

        short a = 3;
        System.out.println(a%2);

        char c1 = 'C';
        char c2 = 'B';
        System.out.println(c2<c1);

        int i = 5;
        System.out.println(i* 30 % 4);

        long l1 = 50000000000L;//без L будет тип int
        System.out.println(l1/2);

        float f = 45.2f;// явно указывается f в конце. Без нее тип double
        System.out.println(f/2);

        double d = 12.3;
        System.out.println(d+f);//приводится к типу double

        boolean g = false;

        ////////////////////////////////////////////////////
        //2 Задание

        int r = 5;
        if(r>0)
        {
            System.out.println("Длина окружности = " +2*Math.PI*r);
            System.out.println("Площадь круга = " +Math.PI*Math.pow(r,2) );
        }
        else
        {
            System.out.println("Невалидные данные");
        }
        ////////////////////////////////////////////////////
        //3 Задание
        int t = 19;//температура
        if(t<10)
        {
            System.out.println("Оденьте куртку");
        }
        else if(t>=10 && t<=15)
        {
            System.out.println("Оденьте ветровку");
        }
        else if (t>=16 && t<=20)
        {
            System.out.println("Оденьте свитер");
        }
        else if(t>=21 && t<=30)
        {
            System.out.println("Оденьте майку");
        }
        else if(t>30 )
        {
            System.out.println("Ничего не одевайте");
        }
        ////////////////////////////////////////////////////
        //4 Задание
        int salary1 = 15;
        int salary2 = 22;
        int salary3 = 38;

        int max = Math.max(Math.max(salary1,salary2),salary3);
        int min = Math.min(Math.min(salary1,salary2),salary3);
        System.out.println("Разница между максим. и миним. зарплатой = " +(max-min));

        ////////////////////////////////////////////////////
        //5 Задание
        int a1 = -2;
        int n = 3;
        int result = 1;//результат первоначально

        for(int i1 = 0; i1<n; i1++)
        {
            result = result*a1;
            //result *=a1;
        }
        System.out.println("результат возведения в степень = " +result);

        ////////////////////////////////////////////////////
        //6 Задание
        double startSum = 25;//начальная сумма
        int proc = 10;// процент годовых
        int years = 5;// кол-во лет вклада

        double nalog = startSum*1/100;//1% от изначального вклада
        double resultat = startSum;

        //цикл по годам
        for(int n2 = 1; n2 <= years; n2++)
        {
            double delta = resultat*proc/100;
            resultat = resultat + delta - nalog;
        }

        System.out.println("На счету в банке будет = " +resultat);



    }
}
