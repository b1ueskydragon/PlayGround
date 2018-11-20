package dailyOne.P276;

import java.util.Arrays;

public class KmpSearch {
  /**
   * pattern 内の重複した文字の並びを見つけ, テーブルを作成する.
   * - 探索中に pattern 不一致の場合,
   * - pattern の移動 (再開する位置 または skip) を大きくするため
   *
   * @param pattern pattern
   * @return partial match table
   */
  private static int[] skipTable(String pattern) {
    int t = 1; // cursor of text
    int p = 0; // cursor of pattern
    int[] table = new int[pattern.length() + 1];

    table[t] = 0; // 照合を再開する index (pattern 1文字目はその位置から再開するため 0)
    while (t != pattern.length()) {
      if (pattern.charAt(t) == pattern.charAt(p)) table[++t] = ++p;
      else if (p == 0) table[++t] = p;
      else p = table[p];
    }

    return table;
  }


  public static void main(String... args) {
    String pat = "ABCABD";
    System.out.println(Arrays.toString(skipTable(pat)));
  }
}
