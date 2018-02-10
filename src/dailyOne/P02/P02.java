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

    int p = 1; // previous (ex. result[0] is 1 before for-loop)
    int n = 1; // next (ex. result[4] is 1 before for-loop)
    // ex.
    // r[1] = r[1] x 1 x a[0]
    // r[3] = r[3] x a[4] x 1
    for (int i = 0; i < len - 1; i++) {
      p *= ary[i];
      result[i + 1] *= p;
      n *= ary[len - (i + 1)];
      result[len - (i + 2)] *= n;
    }
    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
  }
  // かけ算を reduce 処理でしても O(n^2) ?
}
