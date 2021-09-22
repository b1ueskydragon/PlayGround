package daily_coding_problem.p708;

public class Solution {

  public int fixedPoint(final int[] sortedNums) {
    int l = 0;
    int r = sortedNums.length - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;
      int maybeFixedPoint = sortedNums[m];

      if (m == maybeFixedPoint) {
        return m;
      }

      if (m > maybeFixedPoint) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    throw new IllegalArgumentException("Not found.");
  }

}
