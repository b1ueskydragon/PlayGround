package quiz2018;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class FunctionChallenge5 {

  public static void main(String... args) {
    Function<String, String> con = Util::concat;
    BiConsumer<String, String> biConsumer = (x, y)
        -> System.out.println(x + y);

    biConsumer.accept(con.apply("x"), con.apply("y"));
  }

  private static class Util {
    static String concat(String x) {
      return "con".concat(x);
    }
  }
}
