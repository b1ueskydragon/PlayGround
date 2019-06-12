package quiz2018;

public class ToString {

  static int number = 10;

  public static void main(String ... args) {
    new ToString();
    new MisterBean();
  }

  public ToString() {
    System.out.println(this); // ToString.number = 10

   // System.out.println(new MisterBean()); // StackOverflowError
  }

  // Try: erase overwritten toString() and compare the result.
  @Override
  public String toString() {
    return "ToString.number = " + number;
  }

  static class MisterBean extends ToString { }
}