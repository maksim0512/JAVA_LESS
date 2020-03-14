package lessons.lesson13.threadsExample;

public class Main {

  public static void main(String[] args) {

    Thread thread1 = new MyThread("t1");
    Thread thread2 = new Thread(new MyRunnableThread());
    Thread thread3 = new DaemonExample("1");
    Thread thread4 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("lambda" + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    System.out.println("MAIN thread ends");
  }
}
