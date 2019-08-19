package graffiti2019.binarySearch.matrix;

import com.google.common.annotations.VisibleForTesting;

public class KthSmallestInSortedMatrix {

  public static int findKthSmallest(int[][] matrix, int k) {
    var n = matrix.length;
    int startValue = matrix[0][0], endValue = matrix[n - 1][n - 1];

    while (startValue < endValue) {
      int middleValue = (endValue - startValue) / 2 + startValue;
      int count = countLessOrEqualThan(middleValue, matrix);

      // (small, big)
      IntPair pair = new IntPair(matrix[0][0], matrix[n - 1][n - 1]);

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

  @VisibleForTesting
  static int countLessOrEqualThan(int middleValue, int[][] matrix) {
    var count = 0;
    for (int[] column : matrix) {
      for (int el : column) { // row
        if (el <= middleValue) count += 1;
      }
    }
    return count;
  }

}

class IntPair {
  private final int x;
  private final int y;

  IntPair(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int _1() {
    return x;
  }

  int _2() {
    return y;
  }

}
