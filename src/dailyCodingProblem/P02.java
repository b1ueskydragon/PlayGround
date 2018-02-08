package dailyCodingProblem;

import java.util.Arrays;

/**
 * if our input was [1, 2, 3, 4, 5],
 * the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6].
 */
public class P02 {

  private static int[] calc(int... ii) {
    int len = ii.length;
    int[] result = new int[len];

    int mult = 1;
    for (int i : ii) mult *= i;

    for (int i = 0; i < len; i++) result[i] = mult / ii[i];

    return result;
  }

  private static void print(int[] ary) {
    Arrays.stream(ary).forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  public static void main(String... args) {
    print(calc(1, 2, 3, 4, 5));
    print(calc(3, 2, 1));
    print(calc(3, 2, 3));
    print(calc(2, 3, 4));
  }

  // TODO use reduce
}
