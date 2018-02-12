package dailyOne.P04;

import java.util.Arrays;

/**
 * @challenger b1ueskydragon
 */
public class FindLowPosInt {

  private static Integer point = 1; // Tentatively setting: outside scope (is it need?)

  // O(N): each data should be searched at only one time.
  // can modify the input array in-place
  // TODO O(N^N) to O(N)
  private static Integer find(Integer... args) {
    if (args.length == 0) throw new NullPointerException();
    if (!Arrays.asList(args).contains(1)) return 1;

    if (!Arrays.asList(args).contains(point)) {
      return point;
    } else {
      point++;
      find(args);
    }
    return point;
  }

  public static void main(String... args) {
//    System.out.println(find(3, 4, -1, 1)); // 2
//    System.out.println(find(1, 2, 0)); // 3
//    System.out.println(find(2, 5)); // 1
//    System.out.println(find(-2, 1, 2, 5)); // 3

    System.out.println(find(5, 3, 2, 4, 1)); // 6
  }
}
