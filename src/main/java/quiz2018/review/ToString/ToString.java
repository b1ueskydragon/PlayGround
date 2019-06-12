package quiz2018.review.ToString;

public class ToString {
  static int number = 10;

  public static void main(String... doYourBest) {
    new ToString();
  }

  public ToString() {
    // displays "ToString.number = 10"
    System.out.println(this);
  }

  public String toString() { return "ToString.number = " + number; }

  static class MisterBean extends ToString { }
}