package graffiti2018;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author b1ueskydragon
 *
 * Arrange of  http://aperiodic.net/phil/scala/s-99/ 's P08.
 *
 * 重複する要素を全て除去して, かつ, もとの順序を守って圧縮したリストを出力する.
 */
public class Compressing {
  public static void main(String[] args) {
    List<Object> list =
        Arrays.asList("a", Arrays.asList(1,2,3), "b", 1, "b", 99, "e", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, Arrays.asList(1,2,3));

    generalCompress(list, 0, Object.class).forEach(e -> System.out.printf(e + " ", e));

    System.out.print(System.getProperty("line.separator"));

    tableCompress(list).forEach(e -> System.out.printf(e + " ", e));
  }

  /**
   * Compressing using hash table.
   *
   * @param list a list
   * @param <T> type
   * @return result
   */
  private static <T> List<T> tableCompress(List<T> list) {
    Set<T> table = new HashSet<>();
    List<T> result = new ArrayList<>();

    for (T el : list) {
      int oriSize = table.size();
      table.add(el);
      int afSize = table.size();

      if(oriSize < afSize) result.add(el);
    }

    return result;
  }

  /**
   * 汎用的な型のリストを受付, 圧縮を行う.
   *
   * @param list          リスト
   * @param comparisonIdx 比較基準となる要素のインデックス
   * @param <T>           この段階では決まっていない要素の型
   * @return              圧縮したリスト
   */
  private static <T> List<T> generalCompress(List<T> list, int comparisonIdx, Class<T> type) {

    T comparisonHead = type.cast(list.get(comparisonIdx)); // 基準となる List の head (2回目からは List の tail の head を想定) を動的に設定.

    List<T> result = list
        .stream()
        .filter(el -> !el.equals(comparisonHead))
        .collect(Collectors.toList());

    result.add(comparisonIdx, comparisonHead);

    if (comparisonIdx == result.size() - 1) {
      return result; // exit case.
    } else {
      comparisonIdx ++; // standard case のみインクリさせる. 進めてから再帰.
      return generalCompress(result, comparisonIdx, type);
    }
  }

  /**
   * パラメータを元にリストを作成する
   *
   * @param args 任意の数字型の可変長引数
   * @return パラメータを要素として受け付けたリスト
   */
  // TODO: Heap pollution. ref: https://docs.oracle.com/javase/jp/8/docs/technotes/guides/language/non-reifiable-varargs.html
  private static <T extends Number> List<T> makeNumberList(T ... args) {
    List<T> list = new ArrayList<>();
    for (T arg : args) {
      list.add(arg);
    }
    return list;
  }
}