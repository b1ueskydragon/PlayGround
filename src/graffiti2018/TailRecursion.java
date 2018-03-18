package graffiti2018;

/**
 * Java VM options: -Xmx512M
 */
public class TailRecursion {

  /**
   * Recursion
   * (not a tail one since return adding n to function)
   *
   * @param n Natural number
   * @return n までの sum
   */
  private static long recursionSum(long n) {
    if (n == 0) {
      return 0; // base case
    }
    return n + recursionSum(n - 1); // recursion case
  }


  /**
   * Invoke a tail recursion
   * (not optimisation yet)
   *
   * @param n Natural number
   * @return sum
   */
  private static long tailRecursionSum(long n) {
    return _tailRecursionSum(n, 0);
  }

  /**
   * Tail recursion helper
   *
   * @param n Natural number
   * @param s 着目時点での sum
   * @return sum
   */
  private static long _tailRecursionSum(long n, long s) {
    if (n == 0) {
      return s;
    }
    return _tailRecursionSum(n - 1, n + s); // 末尾再帰になっている
  }


  public static void main(String... args) {

    System.out.print(recursionSum(10000));
    System.out.print(tailRecursionSum(10000));

    // System.nanoTime() 時間は大した差なかった?
  }
}
