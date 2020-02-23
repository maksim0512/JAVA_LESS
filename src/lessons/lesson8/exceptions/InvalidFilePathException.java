package lessons.lesson8.exceptions;

public class InvalidFilePathException extends Exception {

  public InvalidFilePathException() {
  }

  public InvalidFilePathException(String message) {
    super(message);
  }
}
