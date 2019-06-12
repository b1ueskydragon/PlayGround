package graffiti2018;

// TODO More understand AND Improvement
// TODO Considering side effect AND refactor
public class EightQueen {
  private static boolean[] eachLineFlag = new boolean[8]; // 各行に王妃が配置済みか
  private static boolean[] bottomLeftDiagonal = new boolean[15]; //  / 対角線に王妃が配置済みか  (j 行 i 列 == i + j)
  private static boolean[] bottomRightDiagonal = new boolean[15]; //  \ 対角線に王妃が配置済みか (j 行 i 列 == i - j + 7)
  private static int[] columnPos = new int[8]; // 各列の王妃の配置

  private static int count  = 0;

  // 各列の王妃の位置を出力
  private static void print() {
    for (int i = 0; i < 8; i++) {
      System.out.printf("%2d", columnPos[i]);
    }
    System.out.println();
    count += 1;
  }

  // i 行目の適切な位置に王妃を配置
  private static void set(int i) {
    for (int j = 0; j < 8; j++) {
      if (!eachLineFlag[j] &&
          !bottomLeftDiagonal[i + j] &&
          !bottomRightDiagonal[i - j + 7]) {

        columnPos[i] = j; // 王妃を j 行に配置
        if (i == 7) { // 全列に配置終了
          print();
        } else {
          eachLineFlag[j] = bottomLeftDiagonal[i + j] = bottomRightDiagonal[i - j + 7] = true;
          set(i + 1);
          eachLineFlag[j] = bottomLeftDiagonal[i + j] = bottomRightDiagonal[i - j + 7] = false;
        }
      }
    }
  }

  public static void main(String... args) {
    set(0);
    System.out.println(count);
  }
}
