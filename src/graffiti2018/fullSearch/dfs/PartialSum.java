package graffiti2018.fullSearch.dfs;

import java.util.Scanner;
import java.util.stream.IntStream;

// 与えられた n 個の整数 a1,...,an から部分集合をうまく選んで, その集合内の数の和が与えられた数 k に等しくなるようにできるかどうかを判定する.
public class PartialSum {
  private static Scanner sc = new Scanner(System.in);

  // the number of integer
  private final static int n = sc.nextInt();
  // n integers
  private final static int[] a = IntStream.range(0, n).map(i -> i = sc.nextInt()).toArray();
  // sum of n integer (would be)
  private final static int k = sc.nextInt();

  /**
   * Using depth-first search.
   *
   * @param i   index of a0 ~ ai
   * @param sum sum of integer until current a[i]
   * @return
   */
  private static boolean dfs(int i, int sum) {
    // n 個決め終わった状態
    if (i == n) return sum == k;
    // sum not use a[i]
    if (dfs(i + 1, sum)) return true;
    // sum use a[i]
    if (dfs(i + 1, sum + a[i])) return true;
    // full searched but not found
    return false;
  }

  public static void main(String... args) {
    /*
     * e.g.
     * n = 4
     * a = {1, 2, 4, 7}
     * k = 13
     */
    System.out.println(dfs(0, 0));
    sc.close();
  }
}
