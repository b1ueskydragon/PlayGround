package graffiti;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Arrange of  http://aperiodic.net/phil/scala/s-99/ 's P08.
 *
 * 重複する要素を全て除去して, かつ, もとの順序を守って圧縮したリストを出力する.
 */
public class Compressing {
  public static void main(String[] args) {
    List<Object> list = Arrays.asList("a", 1, "b", 1, "b", "c", "c", "d", "a", 1);
    List<String> strList = Arrays.asList("c", "a", "b", "b", "c", "a", "d", "b");

    for (int i = 0; i < list.size() - 1; i++) {
      if (i == list.size() - 1) break;
      list = generalCompress(list, i);
    }

    list.forEach(System.out::println);
  }

  /**
   * 汎用的な型のリストを受付, 圧縮を行う.
   *
   * @param list          リスト
   * @param comparisonIdx 比較基準となる要素のインデックス
   * @param <T>           この段階では決まっていない要素の型
   * @return              圧縮を一度施したリスト
   */
  // TODO ループもこの中で完結させる -> 再帰
  private static <T> List<T> generalCompress(List<T> list, int comparisonIdx) {

    T comparisonHead = list.get(comparisonIdx); // 基準となる List の head (2回目からは List の tail の head を想定) を動的に設定.

    List<T> result = list
        .stream()
        .filter(el -> !el.equals(comparisonHead))
        .collect(Collectors.toList());

    result.add(comparisonIdx, comparisonHead);

    return result;
  }
}
