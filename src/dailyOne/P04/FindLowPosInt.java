package dailyOne.P04;

import java.util.*;

/**
 * @challenger b1ueskydragon
 * O(N): each data should be searched at only one time.
 * can modify the input array in-place
 */
public class FindLowPosInt {

  private static Integer point = 1; // Tentatively setting: outside scope (is it need?)

  // ?: Arrays.contains -> return indexOf contains for-loop of array.
  private static Integer findByContains(Integer... args) {
    if (args.length == 0) throw new NullPointerException();
    if (!Arrays.asList(args).contains(1)) return 1;
    return findByContainsHelper(args);
  }

  private static Integer findByContainsHelper(Integer[] ary) {
    if (!Arrays.asList(ary).contains(point)) {
      return point;
    } else {
      point++;
      findByContainsHelper(ary);
    }
    return point;
  }

  // O(N logN): since sort first only one time and look, so O(N logN + N)
  private static Integer findBySort(Integer... args) {
    if (args.length == 0) throw new NullPointerException();

    Collections.sort(Arrays.asList(args)); // quick sort

    int len = args.length;
    int last = len - 1;

    Integer put = args[last] + 1;

    // TODO Simplify
    for (int i = 0; i < len; i++) {
      if (args[i] < 1) {
        args[i] = 1;
      } else {
        Integer next = (i == last) ? args[last] : args[i + 1];
        if (i != 0 && args[i - 1] == 0 && args[i] != 1) {
          return 1;
        }
        if (next - args[i] > 1) {
          put = args[i] + 1;
        }
      }
    }
    return put;
  }

  // O(N): why?
  private static Integer findBySet(Integer... args) {
    Set<Integer> set = new HashSet<>();
    set.addAll(Arrays.asList(args));
    Integer i = 1;
    while (set.contains(i)) {
      i += 1;
    }
    return i;
  }

  public static void main(String... args) {
    System.out.println(findBySet(3, -1, 4, 1));
    System.out.println(findBySet(2, 0, 1));
    System.out.println(findBySet(2, 6, 4, 5, 1, 3));
  }
}
