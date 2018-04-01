package graffiti2018;

import java.util.*;

/**
 * P09 arrange (重複を許さないパターン).
 * <p>
 * version: Make it work first.
 */
public class Pack {
  private static <T> List<T> pList(T element) {
    List<T> outer = new ArrayList<>(); // add in here
    outer.add(element);
    return outer;
  }

  private static <T> List<List<T>> pack(List<T> unpacked) {
    List<List<T>> outer = new ArrayList<>(); // add in here
    Map<T, Integer> table = new HashMap<>(); // mapping [element : toPut index]

    for (T el : unpacked) {
      if (outer.isEmpty()) {
        outer.add(pList(el));
        table.put(el, 0);
      } else if (!table.containsKey(el)) {
        outer.add(pList(el));
        int lstIdx = outer.size() - 1;
        table.put(el, lstIdx);
      } else {
        int spot = table.get(el);
        outer.get(spot).add(el);
      }
    }
    return outer;
  }


  public static void main(String... args) {
    List<Character> sample = Arrays.asList('a', 'a', 'c', 'a', 'b', 'b', 'c', 'a', 'c');
    pack(sample).forEach(System.out::print); // [a a a a] [b b] [c c c]
  }
}
