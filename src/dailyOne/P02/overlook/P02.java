package dailyOne.P02.overlook;

import static dailyOne.CommonUtils.*;

/**
 * @challenger b1ueskydragon
 */
public class P02 {
  // 掛け算の reduce 処理でしても O(n^2) ?
  private static int[] calc(int... ints) {
    int folding = 1;
    for (int i : ints) {
      if (folding == 0) return new int[ints.length];
      folding *= i;
    }

    for (int i = 0; i < ints.length; i++) {
      ints[i] = folding / ints[i];
    }
    return ints;
  }

  public static void main(String... args) {
    printAry(calc(1, 2, 3, 4, 5));
    printAry(calc(3, 2, 1));
    printAry(calc(3, 2, 3));
    printAry(calc(2, 3, 0, 4));
    printAry(calc(3, 3, 3));
  }
}
