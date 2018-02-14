package dailyOne.P05;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @b1ueskydragon
 */
public class ClosuresByClass {
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
    Closures<Integer, Pair<Integer, Integer>> closures = new Closures<>();
    Pair<Integer, Pair<Integer, Integer>> pair = closures.cons.apply(3, new Pair<>(3, 4));

    System.out.println(closures.car.apply(pair)); // 3

    Closures<Integer, Integer> integerClosures = new Closures<>();
    System.out.println(integerClosures.car.apply(closures.cdr.apply(pair))); // 3
    System.out.println(integerClosures.cdr.apply(closures.cdr.apply(pair))); // 4
  }
}
