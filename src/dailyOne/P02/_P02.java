package dailyOne.P02;

import java.util.stream.IntStream;

import static dailyOne.CommonUtils.*;

public class _P02 {

  private static int[] calc(int... ary) {

    int len = ary.length;
    int[] left = new int[len];
    IntStream.range(0, len).forEach(i -> left[i] = 1);

    for (int i = 1; i < len; i++) {
      left[i] = left[i - 1] * ary[i - 1];
    }

    int[] right = new int[len];
    IntStream.range(0, len).forEach(i -> right[i] = 1);

    for (int i = 2; i <= len; i++) {
      right[len - i] = right[len - i + 1] * ary[len - i + 1];
    }

    int[] result = new int[len];
    IntStream.range(0, len).forEach(i -> result[i] = 1);

    for (int i = 0; i < len; i++) {
      result[i] = left[i] * right[i];
    }

    return result;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
    printAry(calc(3, 2, 1));
  }
}
