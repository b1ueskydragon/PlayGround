package dailyOne.p641;

public class Solution {
  public int findTheSmallestNotInSubSetSum(int[] sortedArr) {
    int prev = 0;
    int sumSoFar = 0;

    for (int x : sortedArr) {
      if (x == 1 || sumSoFar > x) prev++; // since next num could be built up do +1.
      else if (x - prev == 1) prev = x;
      else break;

      sumSoFar += x;
    }
    return sumSoFar + 1;
  }

}
