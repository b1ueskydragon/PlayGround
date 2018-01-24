package quiz2018;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionChallenge2 {
  public static void main(String... args) {
    String soprano = null;

    CloseIt closeIt = new CloseIt();

    try (closeIt) {
      System.out.println(soprano.matches(null)); // NullPointerException
    } catch (Exception exception) {
      System.out.println("exception");
    } catch (Throwable throwable) {
      System.out.println("throwable");
    }
  }

  private static class CloseIt implements Closeable {
    @Override
    public void close() throws IOException {
      System.out.println("close");
    }
  }
}
