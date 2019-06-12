package quiz2018;

import java.util.concurrent.atomic.AtomicInteger;

public class InstanceofChallenge {

  public static void main(String... args) {
    if (null instanceof Object) {
      System.out.println("null is instance of Object");
    }
    if (null instanceof AtomicInteger) {
      System.out.println("null is instance of AtomicInteger");
    }
    if (null instanceof StackOverflowError) {
      System.out.println("null is instance of StackOverflowError");
    }
  }
}
