package dailyOne.P99;

import java.util.Arrays;

/**
 * find the length of the longest consecutive elements sequence in O(N logN).
 */
public class LongestConsecutive {
  public static void main(String... args) {
    int[] given = {103, 104, 106, 4, 5, 7, 8, 9, 100, 2, 3, 101, 102};
    Arrays.sort(given);
    System.out.println(countLength(given));
  }

  private static int countLength(int[] sorted) {
    int cnt = 1;
    int tmp = 0;

    for (int i = 1; i < sorted.length; i++) {
      if (sorted[i] - sorted[i - 1] == 1) {
        cnt += 1;
      } else {
        tmp = Math.max(tmp, cnt);
        cnt = 1;
      }
    }
    return Math.max(tmp, cnt);
  }
}