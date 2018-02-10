package dailyOne.P02;

import java.util.stream.IntStream;

import static dailyOne.CommonUtils.*;

/**
 * @challenger b1ueskydragon
 */
public class P02 {
  // Given an array of integers,
  // return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
  // Solve it without using division and in O(n) time.
  private static int[] calc(int... ary) {
    int len = ary.length;
    int[] result = new int[len];
    IntStream.range(0, len).forEach(i -> result[i] = 1); // make all of elements of result 1

    int left = 1; // ex. result[0] is 1 before for-loop
    int right = 1; // ex. result[4] is 1 before for-loop
    // ex.
    // r[2] = left          x     right
    // r[2] = r[1] x r[1]   x     r[3] x a[3]
    for (int i = 0; i < len - 1; i++) {
      left *= ary[i];
      result[i + 1] *= left;
      right *= ary[len - (i + 1)];
      result[len - (i + 2)] *= right;
    }
    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
  }
  // かけ算を reduce 処理でしても O(n^2) ?
}
