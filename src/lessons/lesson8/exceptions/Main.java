package lessons.lesson8.exceptions;

public class Main {
  public static void main(String[] args) {

    CheckedExceptionExample e = new CheckedExceptionExample();

    String path = "/nofile.nf";

    try {
      e.read(path);
    } catch (InvalidFilePathException ex) {
      System.err.println("invalid path: " + ex.getMessage());
    }

    System.out.println("end");
  }
}
