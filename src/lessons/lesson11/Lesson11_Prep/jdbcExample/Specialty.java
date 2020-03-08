package lessons.lesson11.Lesson11_Prep.jdbcExample;

import java.util.Objects;

public class Specialty {

  private int id;

  private String specialty;

  public Specialty(int id, String specialty) {
    this.id = id;
    this.specialty = specialty;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  @Override
  public String toString() {
    return "Specialty{" +
        "id=" + id +
        ", specialty='" + specialty + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Specialty specialty1 = (Specialty) o;
    return id == specialty1.id &&
        Objects.equals(specialty, specialty1.specialty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, specialty);
  }
}
