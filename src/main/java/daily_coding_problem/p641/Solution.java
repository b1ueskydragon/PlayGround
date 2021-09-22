package daily_coding_problem.p641;

// As long as the array is sorted asc and includes 1,
// sumSoFar is valid to represent [1, sumSoFar-1].
public class Solution {
  public int findTheSmallestNotInSubSetSum(int[] sortedArr) {
    int sumSoFar = 1;
    for (int x : sortedArr) {
      if (x > sumSoFar) break;
      sumSoFar += x;
    }
    return sumSoFar;
  }
}
