package graffiti;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compressing {
  public static void main(String[] args) {
    List<Object> list = Arrays.asList("a", 1, "b", 1, "b", "c", "c", "d", "a", 1);

    for (int i = 0; i < list.size() - 1; i++) {
      if (i == list.size() - 1) break;
      list = generalCompress(list, i);
    }

    list.forEach(System.out::println);
  }


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
