package quiz2018;

public class ShadowChallenge {

  private static long number = 100;

  public ShadowChallenge() {
    number = 0;
  }

  public static void main(String... args) {
    long number = 50;

    System.out.println(ShadowChallenge.number + number + 20); // initialized before object is created.

    System.out.println(new ShadowChallenge().number + ShadowChallenge.number); // object created, constructor invoked, global static value changed.

    //executeTest(number); // number is ..
  }

  static void executeTest(long number) { // not invoked
    System.out.println(ShadowChallenge.number + number);
  }
}
