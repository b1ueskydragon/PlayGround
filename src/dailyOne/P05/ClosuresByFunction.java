package dailyOne.P05;

import javafx.util.Pair;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClosuresByFunction {

  private static void exeClosures() {
    BiFunction<Integer, Integer, Pair<Integer, Integer>> cons = (a, b) -> new Pair<>(a, b); // Pair::new
    Function<Pair<Integer, Integer>, Integer> car = pair -> pair.getKey(); // Pair::getKey
    Function<Pair<Integer, Integer>, Integer> cdr = pair -> pair.getValue(); // Pair::getValue

    Pair<Integer, Integer> pair = cons.apply(3, 4);
    System.out.println(car.apply(pair));
    System.out.println(cdr.apply(pair));
  }

  public static void main(String... args) {
    exeClosures();
  }
}
