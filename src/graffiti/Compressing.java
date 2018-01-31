package graffiti;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compressing {
  public static void main(String[] args) {
    List<Object> strDuplicatedList = Arrays.asList("a", 1, "b", 1, "b", "c", "c", "d", "a");

    for (int i = 0; i < strDuplicatedList.size() - 1; i++) {
      try {
        strDuplicatedList = generalCompress(strDuplicatedList, strDuplicatedList.get(i), i);
      } catch (IndexOutOfBoundsException e) { // TODO 例外がなくても動くプログラムに変更
        break;
      }
    }
    strDuplicatedList.forEach(System.out::println);

  }

  private static <T> List<T> generalCompress(List<T> list, T head, int newHeadInx) {
    List<T> result = list.stream().filter(el -> !el.equals(head)).collect(Collectors.toList());
    result.add(newHeadInx, head);
    return result;
  }

  private static List<Object> compress(List<Object> list, Object head, int newHeadInx) {
    List<Object> result = list.stream().filter(el -> !el.equals(head)).collect(Collectors.toList());
    result.add(newHeadInx, head);
    return result;
  }
}
