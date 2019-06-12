package quiz2018.quizArrange;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class FunctionChallenge5 {
  public static void main(String... args) {
    Function<String, String> con = Util::concat;
    BiConsumer<String, String> biConsumer = (x, y)
        -> System.out.println(x + y);

    biConsumer.accept(con.apply("x"), con.apply("y"));

    biConsumer.andThen(new BiConsumer<String, String>() {
      @Override
      public void accept(String s, String s2) { }
    }).accept("a", "b");

    biConsumer.andThen((s1, s2) -> { }).accept("c", "d");
  }

  private static class Util {
    static String concat(String x) {
      return "con".concat(x);
    }
  }
}
