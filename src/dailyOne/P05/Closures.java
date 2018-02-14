package dailyOne.P05;

import javafx.util.Pair;

public class Closures {

  private static <T, U> Pair<T, U> cons(T a, U b) {
    return new Pair<>(a, b);
  }

  private static <T, U> T car(Pair<T, U> pair) {
    return pair.getKey();
  }

  private static <T, U> U cdr(Pair<T, U> pair) {
    return pair.getValue();
  }

  public static void main(String... args) {
    System.out.println(car(cons(3, 4)));
    System.out.println(cdr(cons(3, 4)));

    System.out.println(car(car(cons(cons(3, 4), 4))));
  }
}
