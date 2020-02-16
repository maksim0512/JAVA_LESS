package lessons.lesson5.Task2;

public class Worker extends Person {

  private String factoryName;

  public Worker(String name, int age, String factoryName) {
    super(name, age);

    this.factoryName = factoryName;
  }

  @Override
  public void doWork() {
    System.out.println(super.getName() + " is working hard");
  }

  public String getFactoryName() {
    return factoryName;
  }

  public void setFactoryName(String factoryName) {
    this.factoryName = factoryName;
  }

  @Override
  public String toString() {
    return "Worker{" + super.toString() +
        ", factoryName='" + factoryName + '\'' +
        '}';
  }
}
