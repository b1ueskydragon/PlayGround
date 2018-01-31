package graffiti;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Compressing {
  public static void main(String[] args) {
    List<Object> list = Arrays.asList("a", 1, "b", 1, "b", "c", "c", "d", "a");

    for (int i = 0; i < list.size() - 1; i++) {
      list = generalCompress(list, list.get(i), i);
      if (i == list.size() - 1) break;
    }
    list.forEach(System.out::println);
  }

  private static <T> List<T> generalCompress(List<T> list, T head, int newHeadInx) {
    List<T> result = list
        .stream()
        .filter(el -> !el.equals(head))
        .collect(Collectors.toList());

    result.add(newHeadInx, head);
    return result;
  }

  // prototype
  private static List<Object> compress(List<Object> list, Object head, int newHeadInx) {
    List<Object> result = list.stream().filter(el -> !el.equals(head)).collect(Collectors.toList());
    result.add(newHeadInx, head);
    return result;
  }
}
