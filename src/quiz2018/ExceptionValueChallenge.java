package quiz2018;

public class ExceptionValueChallenge {
  private static int kratos, zeus, hades;

  public static void main(String... args) {
    try {
      test(kratos = 1, lightningOfZeus(zeus = 2), hades = 3);
    } catch (Exception e) {
      System.out.println(kratos + " " + zeus + " " + hades); // hades is 0
    }
  }

  static int lightningOfZeus(int i) throws Exception {
    throw new Exception("Wowww!"); // if we change here to `Exception` than catch block can print out
  }

  static int test(int a, int b, int c) {
    return a + b + c;
  }
}
