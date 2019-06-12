package fe.afternoon.h29a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TableSorter {
  private Map<String, Comparator<String>> orderMap = new HashMap<>();

  public void putSortOrder(String key, Comparator<String> order) {
    orderMap.put(key, order);
  }

  /**
   * @param table    ソート対象の表を格納した String [] を要素に持つ配列
   * @param orderBys 条件 (複数指定可. 先に指定した条件が優先される)
   */
  public void sort(String[][] table, final OrderBy... orderBys) {
    Arrays.sort(table, new Comparator<String[]>() {
      @Override
      public int compare(String[] s1, String[] s2) {
        for (OrderBy orderBy : orderBys) {
          int order = orderMap.get(orderBy.key)
              .compare(s1[orderBy.col], s2[orderBy.col]); // col は orderBy インスタンスから取得する
          if (order != 0) { // not equal
            return orderBy.isReversed ? -order : order;
          }
        }
        return 0; // equal
      }
    });
  }

  public static class OrderBy {
    final String key;
    final int col;
    final boolean isReversed;

    /**
     * 昇順でソーとする.
     *
     * @param key 順序指定子の文字列
     * @param col 比較対象の列の位置. table[i][0], table[i][1] ...
     */
    public OrderBy(String key, int col) {
      this(key, col, false);
    }

    /**
     * isReversed が true の場合, 降順でソートする.
     *
     * @param key
     * @param col
     * @param isReversed
     */
    public OrderBy(String key, int col, boolean isReversed) {
      this.key = key;
      this.col = col;
      this.isReversed = isReversed;
    }
  }
}
