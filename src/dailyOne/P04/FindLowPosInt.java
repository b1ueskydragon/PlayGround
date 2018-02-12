package dailyOne.P04;

import java.util.Arrays;
import java.util.Collections;

/**
 * @challenger b1ueskydragon
 */
public class FindLowPosInt {

  private static Integer point = 1; // Tentatively setting: outside scope (is it need?)

  // O(N): each data should be searched at only one time.
  // can modify the input array in-place
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

//  private static Integer findBySort(Integer... args) {
//    Collections.sort(Arrays.asList(args));
//    Integer head = args[0];
//    Integer last = args[args.length - 1];
//    return point;
//  }

  public static void main(String... args) {
    System.out.println(findByContains(3, 4, -1, 1)); // 2
    System.out.println(findByContains(1, 2, 0)); // 3
    System.out.println(findByContains(2, 5)); // 1
    System.out.println(findByContains(-2, 1, 2, 5)); // 3
    System.out.println(findByContains(5, 3, 2, 4, 1)); // 6
  }
}
