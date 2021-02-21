package lessons.lesson13.syncExample;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();

    Thread t1 = new MyThread(c);
    Thread t2 = new MyThread(c);

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.out.println(c.getI());
  }
}
