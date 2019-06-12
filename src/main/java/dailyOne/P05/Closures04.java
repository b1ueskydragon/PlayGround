package dailyOne.P05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Closures04<T, U> {
  private interface Pair<T, U> {
    T getT();

    U getU();
  }

  private BiFunction<T, U, Pair> cons = (t, u) -> new Pair() {
    @Override
    public T getT() {
      return t;
    }

    @Override
    public U getU() {
      return u;
    }
  };

  private Function<Pair<T, U>, T> car = Pair::getT;

  private Function<Pair<T, U>, U> cdr = Pair::getU;

  public static void main(String... args) {
    System.out.println(
        new Closures04<String, Integer>().cdr.apply(new Closures04<String, Pair<String, Integer>>()
            .cons.apply("あ", new Closures04<String, Integer>().cons.apply("A", 0)))
    );
  }
}
