package lessons.lesson12.projectExample.exceptions;

public class NoSuchPupilException extends RuntimeException
{
  public NoSuchPupilException(String message)
  {
    super(message);
  }
}
