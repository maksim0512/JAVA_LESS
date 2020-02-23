package lessons.lesson8.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

  public void read(String path) throws InvalidFilePathException {

    File file = new File(path);

//    try {
    try {
      BufferedReader rdr = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException ex) {
      throw new InvalidFilePathException(path);
    }
   /* } catch (FileNotFoundException e) {
      e.printStackTrace();
    }*/
    //...

  }
}
