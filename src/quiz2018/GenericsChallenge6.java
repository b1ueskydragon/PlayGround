package quiz2018;

public class GenericsChallenge6 {

  public static void main(String... args) {
    new Homer<>("goHomer", 10) {
      // can override a method inside here
    }.<Double>print(10D);
  }

  static class Homer<T, O extends Integer> {
    T t;
    O o;

    public Homer(T t, O o) {
      this.t = t;
      this.o = o;
    }

    <Krusty extends Number> void print(Krusty krusty) {
      System.out.println(t + "" + (o.intValue() + 2) + krusty.intValue());
    }
  }
}
