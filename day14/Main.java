import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main {
  public static void main(String[] args) {
    try {

      // Creates a FileInputStream
      FileInputStream file = new FileInputStream("input.txt");

      // Creates a BufferedInputStream
      BufferedInputStream input = new BufferedInputStream(file);

      // Reads first byte from file
      int i = input .read();

      while (i != -1) {
        System.out.print((char) i);

        // Reads next byte from the file
        i = input.read();
      }
      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}