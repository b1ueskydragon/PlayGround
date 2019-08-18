package graffiti2019.binarySearch.matrix;

/**
 * not a binary search. flatten first and find k.
 * additional O(N) space is required.
 */
public class Solution {

  public static int findKthSmallest(int[][] matrix, int k) {
    return flatten(matrix.length - 1, matrix)[k - 1];
  }

  private static int[] flatten(int rowNum, int[][] matrix) {
    if (rowNum < 1) return matrix[rowNum];
    else if (rowNum == 1) return merge(matrix[0], matrix[1]);
    else return merge(flatten(rowNum - 1, matrix), matrix[rowNum]);
  }

  private static int[] merge(int[] a, int[] b) {
    int i = 0;
    int j = 0;
    int x = 0;
    int[] merged = new int[a.length + b.length];

    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        merged[x] = a[i];
        i += 1;
      } else {
        merged[x] = b[j];
        j += 1;
      }
      x += 1;
    }

    for (; i < a.length; i++) {
      merged[x] = a[i];
      x += 1;
    }

    for (; j < b.length; j++) {
      merged[x] = b[j];
      x += 1;
    }

    return merged;
  }

}
