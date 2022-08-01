package tech.vladflore.java17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TWR {
  public static void main(String[] args) throws IOException {
    try (
        InputStream r1 = new FileInputStream(
            new File("TWR.java"))) {
      r1.read();
    } catch (IOException e) {
      throw e;
    }

    m();

  }

  static void m() throws IOException {
    InputStream r1 = new FileInputStream(new File("TWR.java"));
    try (r1) {
      r1.read();
    }
    r1.read();
  }

}
