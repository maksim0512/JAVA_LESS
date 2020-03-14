package lessons.lesson13.threadsExample;

public class MyThread extends Thread {

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {

    System.out.println(super.getName() + " new Thread");

    for (int i = 0; i < 10; i++) {
      System.out.println(getName() + " " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println(super.getName() + " thread ends");
  }
}
