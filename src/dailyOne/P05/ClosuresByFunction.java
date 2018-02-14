package dailyOne.P05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClosuresByFunction {

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

  private static <T, U> void exeClosures(T k, U v) {
    BiFunction<T,  U, Pair<T, U>> cons = (a, b) -> new Pair<>(a, b); // Pair::new
    Function<Pair<T, U>, T> car = pair -> pair.getT(); // Pair::getKey
    Function<Pair<T, U>, U> cdr = pair -> pair.getU(); // Pair::getValue

    Pair<T, U> pair = cons.apply(k, v);
    System.out.println(car.apply(pair));
    System.out.println(cdr.apply(pair));
  }

  public static void main(String... args) {
    exeClosures(3, "4");
  }
}
