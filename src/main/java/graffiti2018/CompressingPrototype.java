package graffiti2018;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Arrange of  http://aperiodic.net/phil/scala/s-99/ 's P08.
 *
 * 重複する要素を全て除去して, かつ, もとの順序を守って圧縮したリストを出力する.
 */
public class CompressingPrototype {
  public static void main(String[] args) {
//    List<Object> list = Arrays.asList("a", Arrays.asList(1,2,3), "b", 1, "b", 99, "e", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, "a", 1, "b", 1, "b", "c", "c", "d", "a", 1, Arrays.asList(1,2,3));
//    List<Object> strList = Arrays.asList("c", "a", "b", "b", "c", "a", "d", "b");
//
//    generalCompress(list, 0).forEach(e -> System.out.printf(e + " ", e));
//    System.out.print(System.getProperty("line.separator"));
//    generalCompress(strList, 0).forEach(e -> System.out.printf(e + " ", e));
//    System.out.print(System.getProperty("line.separator"));

    //generalCompress(makeStringList("a", "b", "c", "d"), 0).forEach(e -> System.out.printf(e + " ", e));

 //   generalCompress(makeNumberList(1, 2, 3, 4, 1), 0).forEach(e -> System.out.printf(e + " ", e)); // コンパイルエラー (List<Object> と List<Number> が異なるため)
  }

  /**
   * 汎用的な型のリストを受付, 圧縮を行う.
   *
   * @param list          リスト
   * @param comparisonIdx 比較基準となる要素のインデックス
   * @return              圧縮したリスト
   */
  private static List<Object> generalCompress(List<Object> list, int comparisonIdx) {

    Object comparisonHead = list.get(comparisonIdx); // 基準となる List の head (2回目からは List の tail の head を想定) を動的に設定.

    List<Object> result = list
        .stream()
        .filter(el -> !el.equals(comparisonHead))
        .collect(Collectors.toList());

    result.add(comparisonIdx, comparisonHead);

    if (comparisonIdx == result.size() - 1) {
      return result; // exit case.
    } else {
      comparisonIdx ++; // standard case のみインクリさせる. 進めてから再帰.
      return generalCompress(result, comparisonIdx);
    }
  }

  private static List<Number> makeNumberList(Number ... nums) {
    List<Number> list = new ArrayList<>();
    for (Number num : nums) {
      list.add(num);
    }
    return list;
  }
}