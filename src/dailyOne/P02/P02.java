package dailyOne.P02;

import java.util.Arrays;

/**
 * @challenger b1ueskydragon
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * Solve it without using division and in O(n) time.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class P02 {

  private static int[] createAry(int... args) {
    int[] ary = new int[args.length];
    int idx = 0;
    for(int arg : args) ary[idx++] = arg;
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
