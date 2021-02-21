package lessons.lesson13.threadsExample;

public class MyRunnableThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Runnable works");
      try {
        Thread.sleep(800);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("RUNNABLE ends");
  }
}
