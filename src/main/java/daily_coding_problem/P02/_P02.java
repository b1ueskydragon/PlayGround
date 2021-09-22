package daily_coding_problem.P02;

import java.util.stream.IntStream;

import static daily_coding_problem.CommonUtils.*;

public class _P02 {

  private static int[] calc(int... ary) {
    int len = ary.length;
    int[] left = new int[len];
    int[] right = new int[len];
    IntStream.range(0, len).forEach(i -> {
      left[i] = 1;
      right[i] = 1;
    });

    for (int i = 0; i < len - 1; i++) {
      left[i + 1] = left[i] * ary[i];
      right[len - i - 2] = right[len - i - 1] * ary[len - i - 1];
    }

    for (int i = 0; i < len; i++) {
      left[i] = left[i] * right[i];
    }

    return left;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
    printAry(calc(3, 2, 1));
  }
}
