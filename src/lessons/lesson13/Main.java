package lessons.lesson13;

public class Main
{
    public static void main(String[] args)
    {
        Thread thread1 = new MyThread("t1");
        Thread thread2 = new MyThread("t2");

        //thread1.run();
        //thread2.run();

        thread1.start();
        thread2.start();

        System.out.println("Main Thread ends");




    }

}
