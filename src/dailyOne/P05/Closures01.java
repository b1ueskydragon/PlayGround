package dailyOne.P05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Closures01 {
  private static class Pair<T, U> {
    private T t;
    private U u;

    Pair(T t, U u) {
      this.t = t;
      this.u = u;
    }

    public T getT() {
      return t;
    }

    public U getU() {
      return u;
    }
  }

  private static class Closures<T, U> {
    BiFunction<T, U, Pair<T, U>> cons = Pair::new;
    Function<Pair<T, U>, T> car = Pair::getT;
    Function<Pair<T, U>, U> cdr = Pair::getU;
  }

  public static void main(String... args) {
    Closures<Integer, Pair<String, Integer>> closures = new Closures<>();
    Pair<Integer, Pair<String, Integer>> pair = closures.cons.apply(1, new Pair<>("A", 0));

    // get "A"
    System.out.println(
        new Closures<String, Integer>().car.apply(closures.cdr.apply(pair))
    );

    System.out.println(pair.getU().getT());
  }
}
