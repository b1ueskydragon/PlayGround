package dailyOne.P04;

import java.util.Arrays;
import java.util.Collections;

/**
 * @challenger b1ueskydragon
 * O(N): each data should be searched at only one time.
 * can modify the input array in-place
 */
public class FindLowPosInt {

  private static Integer point = 1; // Tentatively setting: outside scope (is it need?)

  // TODO Arrays.contains -> return indexOf contains for-loop of array. maximum: O(N^N)
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

  // O(NlogN * N) == O(N^2)
  private static Integer findBySort(Integer... args) {
    if (args.length == 0) throw new NullPointerException();

    quickSort(args);

    int len = args.length;
    int last = len - 1;

    Integer put = args[last] + 1;

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

  // TODO make sort
  private static void quickSort(Integer[] ary) {
    Collections.sort(Arrays.asList(ary));
  }


  // O(N)
  private static Integer find(Integer... args) {
    if (args.length == 0) throw new NullPointerException();

    int len = args.length;
    int last = len - 1;

    Integer put = args[last] + 1;
    Integer maxValue;

    for (int i = 0; i < len; i++) {
      if (args[i] < 1) {
        args[i] = 1;
      } else {
        Integer next = (i == last) ? args[last] : args[i + 1];

        maxValue = (args[next] >= args[i]) ? args[next] : args[i];

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

  public static void main(String... args) {
    System.out.println(find(3, 4, -1, 1));
    System.out.println(find(2, 2, 2, 1, 0));
    System.out.println(find(2, 2, 2, 1, 0));
    System.out.println(find(1, 2, 3, 5, 6));
    System.out.println(find(-3, -4, -2, 1, 2, 5));
    System.out.println(find(1, 19, 1, 1, 1, 10));
  }
}
