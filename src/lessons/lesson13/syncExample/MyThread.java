package lessons.lesson13.syncExample;

public class MyThread extends Thread {

  private final Counter counter;

  public MyThread(Counter c) {

    this.counter = c;
  }

  @Override
  public void run() {

    for (int i = 0; i < 1000000; i++) {

      counter.inc();
    }
  }
}
