package dailyOne.P05;


import java.util.function.BiFunction;
import java.util.function.Function;

public class Closures03<T, U> {

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
    Closures03<String, Integer> closures = new Closures03<>();
    Pair aPair = closures.cons.apply("a", 0);
    String t = closures.car.apply(aPair);
    Integer u = closures.cdr.apply(aPair);

    System.out.println(t);
    System.out.println(u);
  }
}
