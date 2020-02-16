package lessons.lesson6.equalsExample;

import java.util.Objects;

public class Entity implements Comparable<Entity> {

  private int number;

  private String string;

  public Entity(int number, String string) {
    this.number = number;
    this.string = string;
  }

  @Override
  public int compareTo(Entity o) {

    int delta = this.number - o.number;
    if (delta != 0)
      return delta;

    delta = this.string.compareTo(o.string);

    return delta;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Entity entity = (Entity) o;
    return number == entity.number &&
        Objects.equals(string, entity.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, string);
  }
}
