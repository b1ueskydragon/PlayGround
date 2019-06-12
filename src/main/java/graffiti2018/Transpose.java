package graffiti2018;

public class Transpose {
  public static void main(String... args) {

    int[][] matrix = {{3, 1, 4, 1}, {2, 7, 1, 8}, {0, 5, 7, 7}};
    int[][] transposed = transpose(matrix);

    printMatrix(matrix);
    System.out.println("   ↓ ↓ ↓   ");
    printMatrix(transposed);
  }

  /**
   * Transpose and make a new array.
   *
   * @param matrix given array
   * @return transposed array
   */
  private static int[][] transpose(final int[][] matrix) {
    int[][] transposed = new int[matrix[0].length][matrix.length];

    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        transposed[i][j] = matrix[j][i];
      }
    }
    return transposed;
  }

  /**
   * Print array for visual matrix format.
   *
   * @param matrix nested array
   */
  private static void printMatrix(int[][] matrix) {
    for (int[] ary : matrix) {
      System.out.print("{");
      for (int n : ary) {
        System.out.printf("[" + "%d" + "]", n);
      }
      System.out.println("}");
    }
  }
}
