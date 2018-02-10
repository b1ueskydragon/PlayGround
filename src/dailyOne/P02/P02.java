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
    int[] result = new int[ary.length];
    IntStream.range(0, ary.length).forEach(i -> result[i] = 1); // make all of elements of result 1

    int buff = 1;
    for (int i = 0; i < ary.length ; i++) {
      buff *= ary[i];
      result[i] *= buff;
    }

    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
  }
  // かけ算を reduce 処理でしても O(n^2) ?

}
