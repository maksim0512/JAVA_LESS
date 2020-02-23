package lessons.lesson8.ioexamples;

import java.io.*;

public class IOExample {
  public static void main(String[] args) {

    String path = "input.tt";

    File file = new File(path);

    try (InputStream input = new FileInputStream(file)) {

      int readByte;
      while ((readByte = input.read()) != -1) {
        System.out.println((char)readByte);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
