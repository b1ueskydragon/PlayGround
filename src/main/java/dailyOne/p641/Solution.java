package dailyOne.p641;

public class Solution {
  public int findTheSmallestNotInSubSetSum(int[] sortedArr) {
    if (sortedArr[0] != 1) {
      return 1;
    }
    int lim = 0;
    int prev = 0;
    int sumSoFar = 0;

    for (int x : sortedArr) {
      if (x == 1 || sumSoFar > x) prev++; // since next num could be built to do +1.
      else if (x - prev == 1) prev = x;
      else break;

      sumSoFar += x;
      lim++;
    }

    System.out.println(sumSoFar);

    int res = 1;
    for (int i = 0; i < lim; i++) {
      res += sortedArr[i];
    }
    return res;
  }

}
