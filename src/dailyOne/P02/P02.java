package dailyOne.P02;

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

    result[0] = 1 * ary[1] * ary[2] * ary[3] * ary[4];
    result[1] = ary[0] * 1 * ary[2] * ary[3] * ary[4];
    result[2] = ary[0] * ary[1] * 1 * ary[3] * ary[4];
    result[3] = ary[0] * ary[1] * ary[2] * 1 * ary[4];
    result[4] = ary[0] * ary[1] * ary[2] * ary[3] * 1;

    return result;
  }

  public static void main(String... args) {

    printAry(calc(1, 2, 3, 4, 5));
  }
}
