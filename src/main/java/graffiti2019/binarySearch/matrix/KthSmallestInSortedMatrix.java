package graffiti2019.binarySearch.matrix;

import com.google.common.annotations.VisibleForTesting;

public class KthSmallestInSortedMatrix {

  public static int findKthSmallest(int[][] matrix, int k) {
    var n = matrix.length;
    int startValue = matrix[0][0], endValue = matrix[n - 1][n - 1];

    while (startValue < endValue) {
      int middleValue = (endValue - startValue) / 2 + startValue;
      int[] pair = {matrix[0][0], matrix[n - 1][n - 1]};
      int count = countAndAdjust(middleValue, matrix, pair);

      if (k == count) {
        // return result
      }

      if (k > count) {
        // search higher
      } else {
        // search lower
      }

    }

    return startValue;
  }

  /**
   * Count less or equal than target.
   * And adjust if target is too big or small.
   */
  @VisibleForTesting
  static int countAndAdjust(int target, int[][] matrix, int[] pair) {
    var count = 0;
    int n = matrix.length;
    int row = n - 1, column = 0;

    while (row >= 0 && column < n) {
      var curVal = matrix[row][column];
      if (curVal > target) {
        pair[1] = Math.min(pair[1], curVal);
        row -= 1;
      } else {
        count += row + 1; // since columns are sorted too
        pair[0] = Math.max(pair[0], curVal);
        column += 1;
      }
    }

    return count;
  }

}
