package graffiti2018;

import static graffiti2018.Tuple.*;

public class TupleApp {
  public static void main(String... args) {
    Tuple2<String, Integer> tuple = new Tuple2<>("inagon", 1);

    String v = tuple.getA();
    Integer w = tuple.getB();

    System.out.println(v + w);
  }
}
