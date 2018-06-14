package graffiti2018.greedy;

import java.util.Scanner;

// できる限り少ない硬化で支払う.
public class Coins {
  public static void main(String... args) {
    coins(new Scanner(System.in).nextInt());
  }

  private static void coins(int sum) {
    final int[] coins = {1, 5, 10, 50, 100, 500};

    int res = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
      int cnt = (int) Math.ceil(sum / coins[i]); // count of using coins[i]
      sum -= coins[i] * cnt;
      res += cnt;
    }

    System.out.println(res);
  }
}
