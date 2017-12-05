package quiz;

import java.io.Closeable;
import java.io.IOException;

public class ResourcesJava9Challenge2 {

  public static void main(String[] args) throws Exception {
    ResourcesJava9Challenge2.<AutoCloseable>invoke(new Juggy());
  }

  static <T extends AutoCloseable> void invoke(T t) throws Exception {
    try (t) {
      System.out.println("2");
    }
  }

  static class Juggy implements Closeable {
    @Override
    public void close() throws IOException {
      System.out.println("1");
    }
  }
}
