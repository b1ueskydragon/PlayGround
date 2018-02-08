package dailyCodingProblem;


/**
 * if our input was [1, 2, 3, 4, 5],
 * the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6].
 */
public class P02_1 {

  // 1･2･3･4･5 -> 1･1･3･4･5 -> 1･2･1･4･5 -> 1･2･3･1･5 -> 1･2･3･4･1
  private static void calc(int... ii) {
    int[] buff = new int[ii.length];

    for(int i : buff) {
    }

  }

  public static void main(String... args) {
    calc(1, 2, 3, 4, 5);
  }

}
