package graffiti2018.greedy;

import java.util.Scanner;

// できる限り少ない枚数で支払う. 枚数を求める.
public class Coins {

  public static void main(String... args) {
    Scanner input = new Scanner(System.in);

    final int[] units = {1, 5, 10, 50, 100, 500}; // 単位
    int[] given = new int[units.length]; // 各単位の手元の枚数

    for (int i = 0; i < given.length; i++) {
      given[i] = input.nextInt();
    }

    int sum = input.nextInt();

    coins(units, given, sum);
  }

  private static void coins(int[] units, int[] given, int sum) {
    int res = 0;
    for (int i = units.length - 1; i >= 0; i--) {
      int cnt = Math.min(sum / units[i], given[i]); // units[i] を使う枚数
      sum -= units[i] * cnt;
      res += cnt;
    }

    System.out.println(res);
  }
}