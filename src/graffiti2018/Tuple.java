package graffiti2018;

public class Tuple {
  public static class Tuple2<V, W> {
    private final V v;
    private final W w;

    Tuple2(V v, W w) {
      this.v = v;
      this.w = w;
    }

    V getV() {
      return v;
    }

    W getW() {
      return w;
    }
  }
}
