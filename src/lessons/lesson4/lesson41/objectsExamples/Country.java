package lessons.lesson4.lesson41.objectsExamples;

public class Country {

  private String title;

  private static int exampleStaticVariable;

  private int zipCode;

  public Country(String title, int zipCode) {
    this.title = title;
    this.zipCode = zipCode;
  }

  public static String capitalize(String string) {

    exampleStaticVariable++;

    return string.toUpperCase();
  }

  public String getTitle() {
    return title;
  }

  public int getZipCode() {
    return zipCode;
  }

  @Override
  public String toString() {
    return "Country{" +
        "title='" + title + '\'' +
        ", zipCode=" + zipCode +
        '}';
  }
}
