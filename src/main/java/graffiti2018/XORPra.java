package graffiti2018;

/**
 * Let's make condition simply.
 */
public class XORPra {

  private static int makeCondition(boolean a, boolean b) {
    if ((a && !b) || (!a && b)) return 1;
    else return 0;
  }

  private static int makeConditionXOR(boolean a, boolean b) {
    if (a ^ b) return 1;
    else return 0;
  }

  public static void main(String... args) {
    System.out.println(makeCondition(true, true) == makeConditionXOR(true, true));
    System.out.println(makeCondition(true, false) == makeConditionXOR(true, false));
    System.out.println(makeCondition(false, true) == makeConditionXOR(false, true));
    System.out.println(makeCondition(false, false) == makeConditionXOR(false, false));
  }
}
