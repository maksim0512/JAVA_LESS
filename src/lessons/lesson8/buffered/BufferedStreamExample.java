package lessons.lesson8.buffered;

import java.io.*;
import java.util.Scanner;

public class BufferedStreamExample {

  public static void main(String[] args) {

    String pathOut = "output.tt";

    File fileOut = new File(pathOut);

    try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter output = new BufferedWriter(new FileWriter(fileOut, true))) {

      Scanner scanner = new Scanner(System.in);

      scanner.nextInt();

      String inputString = "";

      while (!inputString.equals("exit")) {

        inputString = rdr.readLine();
        String[] splitted = inputString.split(" ");
        String toWrite = quadraString(splitted);

        output.write(toWrite);
        output.newLine();
        output.flush(); //
      }

//      output.flush();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static String quadraString(String[] splitted) {

    StringBuilder sb = new StringBuilder();

    for (String s : splitted) {

      try {
        int number = Integer.parseInt(s);
        sb.append(number * number);
      } catch (NumberFormatException e) {
        sb.append(s);
      } finally {
        sb.append(" ");
      }
    }

    return sb.toString().trim();
  }


}
