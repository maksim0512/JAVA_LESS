package lessons.lesson5.Task2;

public class Manager extends Person {

  private int phoneNumber;

  public Manager(String name, int age, int phoneNumber) {
    super(name, age);

    this.phoneNumber = phoneNumber;
  }

  @Override
  public void doWork() {
    System.out.println(getName() + " is working not so hard.");
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Manager{" + super.toString() +
        ", phoneNumber=" + phoneNumber +
        '}';
  }
}
