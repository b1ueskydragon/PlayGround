package graffiti2019.binarySearch.matrix;

public class KthSmallestInSortedMatrix {

  public static void main(String[] args) {
    int[][] matrix = {{2, 6, 8}, {3, 7, 10}, {5, 8, 11}};
    var res = countLessOrEqualThan(6, matrix);
    System.out.println(res);
  }

  public static int findKthSmallest(int[][] matrix, int k) {
    var n = matrix.length;
    int startValue = matrix[0][0], endValue = matrix[n - 1][n - 1];
    int middleValue = (endValue - startValue) / 2 + startValue;
    int count = countLessOrEqualThan(middleValue, matrix);

    if (k == count) {
      // return res
    } else if (k > count) {
      // update start value

    } else {
      // update end value
    }
    
    return -1;
  }

  private static int countLessOrEqualThan(int middleValue, int[][] matrix) {
    var count = 0;
    for (int[] column : matrix) {
      for (int el : column) { // row
        if (el <= middleValue) count += 1;
      }
    }
    return count;
  }

}
