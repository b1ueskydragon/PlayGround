package graffiti2018;

import java.util.HashMap;
import java.util.Map;

public class Memoization {

  /**
   * pre-memoization. n + 1 回の再帰呼び出しが必要
   *
   * @param n Natural number
   * @return factorial of n
   */
  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  /**
   * n をキーとする広域の連想配列.
   */
  private static Map<Long, Long> table = new HashMap<>();

  /**
   * memoization.
   *
   * @param n Natural number
   * @return factorial of n
   */
  private static Long mFactorial(Long n) {
    if (n == 0) {
      return 1L;

    } else if (table.containsKey(n)) {
      return table.get(n);

    } else {
      Long v = n * mFactorial(n - 1);
      table.put(n, v);
      return v;
    }
  }


  public static void main(String... args) {
    System.out.println(factorial(10));

    System.out.println(mFactorial(10L));
    System.out.println(mFactorial(20L)); // 10! の値は既に記憶されているので再帰呼び出しは 10回で済む.

  }
}
