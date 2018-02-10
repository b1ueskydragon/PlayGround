package dailyOne.P02;

import java.util.stream.IntStream;

import static dailyOne.CommonUtils.*;

/**
 * @challenger b1ueskydragon
 * <p>
 * without using division and in O(n) time
 */
public class P02 {
  private static int[] calc(int... ary) {
    int len = ary.length;
    int[] result = new int[len];
    IntStream.range(0, len).forEach(i -> result[i] = 1); // make all of elements of result 1

    int left = 1;  // Noting in before for-loop (and it is multiple.. init value is 1)
    int right = 1; // same as above

    int last = len - 1;
    for (int i = 0; i < len; i++) {
      result[i] *= left;         // 1st loop: r[0]. r[0] == 1, nothing in left at this time.
      result[last - i] *= right; // 1st loop: r[4]. r[4] == 1, nothing in right at this time.

      left *= ary[i];
      right *= ary[last - i];
    }
    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
    printAry(calc(3, 2, 1));
  }
}
