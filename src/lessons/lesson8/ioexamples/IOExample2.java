package lessons.lesson8.ioexamples;

import java.io.*;

public class IOExample2 {
  public static void main(String[] args) {
    String pathIn = "input.tt";
    String pathOut = "output.tt";

    File fileIn = new File(pathIn);
    File fileOut = new File(pathOut);

    try (Reader input = new FileReader(fileIn);
         Writer output = new FileWriter(fileOut)) {

      int readByte;
      while ((readByte = input.read()) != -1) {
        System.out.println(readByte);
        output.write(readByte);
      }

      output.flush();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
