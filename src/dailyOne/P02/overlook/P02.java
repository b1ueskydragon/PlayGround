package dailyOne.P02.overlook;

import java.util.Arrays;

/**
 * @challenger b1ueskydragon
 */
public class P02 {

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

  private static void print(int[] ary) {
    Arrays.stream(ary).forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  public static void main(String... args) {
    print(calc(1, 2, 3, 4, 5));
    print(calc(3, 2, 1));
    print(calc(3, 2, 3));
    print(calc(2, 3, 0, 4));
    print(calc(3, 3, 3));
  }

  // TODO use reduce
}
