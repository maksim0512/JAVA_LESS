package lessons.lesson13.threadsExample;

public class DaemonExample extends Thread {

  public DaemonExample(String name) {
    super("Daemon" + name);
    setDaemon(true);
  }

  @Override
  public void run() {
    while (true) {
      System.out.println("DAEMON WORKS");

      try {
        Thread.sleep(1666);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
