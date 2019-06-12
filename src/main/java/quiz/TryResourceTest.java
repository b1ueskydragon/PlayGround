package quiz;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *  try-with-resource でも catch は必要
 */
public class TryResourceTest {

  public static void main(String[] agrs) throws IOException {

    try(FileInputStream fi = null) {
      fi.read();
    }

  }
}
