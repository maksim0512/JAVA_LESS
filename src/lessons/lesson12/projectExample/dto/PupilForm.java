package lessons.lesson12.projectExample.dto;

public class PupilForm
{
  private final String name;

  private final int age;

  public PupilForm(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }
}
