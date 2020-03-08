package lessons.lesson11.Lesson11_Prep.jdbcExample;

import java.util.Date;

public class Employee {

  private int id;

  private String name;

  private Date date;

  private int salary;

  private Specialty specialty;

  public Employee(int id, String name, Date date, int salary, Specialty specialty) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.salary = salary;
    this.specialty = specialty;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", date=" + date +
        ", salary=" + salary +
        ", specialty=" + specialty +
        '}';
  }
}
