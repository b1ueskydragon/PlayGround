package graffiti2018;

public class Tuple {
  public static class Tuple2<A, B> {
    private final A a;
    private final B b;

    public Tuple2(A a, B b) {
      this.a = a;
      this.b = b;
    }

    public A getA() {
      return a;
    }

    public B getB() {
      return b;
    }
  }

  public static class Tuple3<A, B, C> extends Tuple2<A, B> {
    private final C c;

    public Tuple3(A a, B b, C c) {
      super(a, b);
      this.c = c;
    }

    public C getC() {
      return c;
    }
  }
}
