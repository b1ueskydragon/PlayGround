package daily_coding_problem.P138;

public class Coins {
  // given: units of cent
  private static int[] coins = {25, 10, 5, 1};

  /**
   * Find the minimum number of coins required to make n cents.
   *
   * @param n n cents
   * @return number of coins required
   */
  private static int countMin(int n) {
    int count = 0;
    int tmpCount;
    for (int i = 0; i <= coins.length - 1; i++) {
      if (coins[i] > n) continue;
      tmpCount = (int) Math.ceil(n / coins[i]);
      n -= tmpCount * coins[i];
      count += tmpCount;
    }
    return count;
  }

  public static void main(String... args) {
    int n = 16;
    System.out.println(countMin(n));
  }
}
