package dailyOne.P99;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * find the length of the longest consecutive elements sequence in O(n).
 */
public class LongestConsecutive {
  public static void main(String... args) {
    Integer[] given = {100, 4, 200, 3, 2, 101};
    extract(given).forEach(System.out::println);
  }

  // TreeSet O(log n)
  // HashSet O(1)
  private static Set<Integer> toSet(Integer[] given) {
    return new TreeSet<>(Arrays.asList(given));
  }

  private static Set<Integer> extract(Integer[] given) {
    final Set<Integer> table = toSet(given);

    Set<Integer> tmpA = new HashSet<>();
    Set<Integer> tmpB = new HashSet<>();

    for (int i = 1; i < max ; i++) {
      if (table.contains(i + 1) && table.contains(i - 1)) {
        tmpA.add(i);
      }
    }

    return tmpA;
  }
}
