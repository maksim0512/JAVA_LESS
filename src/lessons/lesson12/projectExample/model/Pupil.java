package lessons.lesson12.projectExample.model;

import java.util.Objects;

public class Pupil
{
  private int id;

  private String name;

  private int age;

  public Pupil(int id, String name, int age)
  {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  @Override
  public String toString()
  {
    return "Pupil{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pupil pupil = (Pupil) o;
    return id == pupil.id;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id);
  }
}
