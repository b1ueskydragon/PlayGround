package graffiti2018;

public class Tuple<V, W> {
  private final V v;
  private final W w;

  Tuple(V v, W w) {
    this.v = v;
    this.w = w;
  }

  V getV() {
    return v;
  }

  W getW() {
    return w;
  }

  private static class TurPleApp {
    public static void main(String... args) {
      Tuple<String, Integer> tuple = new Tuple<>("inagon", 11111);

      String v = tuple.getV();
      Integer w = tuple.getW();

      System.out.println(v + w);
    }
  }
}
