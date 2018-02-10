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

    int left = 1; // Noting in before for-loop (at it is multiple.. init value is 1)
    int right = 1; // same as above

    int last = len - 1;
    for (int i = 0; i < len; i++) {
      result[i] = left * result[i]; // 1st loop: r[0]. r[0] == 1, left == 1 at this time.
      result[last - i] = result[last - i] * right; // 1st loop: r[4]. r[4] == 1, right == 1 at this time.

      left = left * ary[i];
      right = ary[last - i] * right;
    }
    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
  }
  // かけ算を reduce 処理でしても O(n^2).
}
