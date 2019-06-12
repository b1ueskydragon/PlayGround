package dailyOne.P02;

import java.util.stream.IntStream;

public class __P02 {

  private static int[] calc(int... ary) {
    int len = ary.length;
    int[] result = new int[len];
    IntStream.rangeClosed(0, len).forEach(i -> result[i] = 1);

    // 積み重ね
    int leftFold = 1;
    int rightFold = 1;

    for (int i = 0; i < len; i++) {
      // TODO
    }

    return result;
  }

  public static void main(String... args) {


  }
}
