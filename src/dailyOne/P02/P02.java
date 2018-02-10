package dailyOne.P02;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @challenger b1ueskydragon
 */
public class P02 {

  private static int[] createAry(int... args) {
    int[] ary = new int[args.length];
    IntStream.range(0, args.length).forEach(i -> ary[i] = args[i]);
    return ary;
  }

  private static void print(int[] ary) {
    Arrays.stream(ary).forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  // Solve it without using division and in O(n) time.
  private static int[] calc(int... ary) {


    return ary;
  }

  public static void main(String... args) {
    print(createAry(1, 2, 3, 4));
  }
}
