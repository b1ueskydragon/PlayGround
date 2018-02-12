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

  // Arrays.contains -> return indexOf contains for-loop of array. maximum: O(N^N)
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

  // O(N logN * N) == O(N^2 * logN)
  // Sort first and look, so O(N logN + N) == O(N logN)
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

  // TODO O(N)
//  private static Integer find(Integer... args) {
//    if (args.length == 0) throw new NullPointerException();
//    int divisionIdx = (int) Math.ceil((args.length - 1) / 2.0);
//
//    int leftFind = 0;
//    int rightFind = 0;
//
//
//    for (int i = 0; i < divisionIdx; i++) {
//      if (args[i] < 0) {
//        args[i] = 0;
//      }
//
//      if (args[0] > args[1]) {
//        leftFind = args[1] + 1;
//      } else {
//        leftFind = args[0] + 1;
//      }
//    }
//
//    for (int i = divisionIdx; i< args.length -1 ; i ++) {
//      if (args[i] < 0) {
//        args[i] = 0;
//      }
//
//      if (args[2] > args[3]) {
//        rightFind = args[3] + 1;
//      } else {
//        rightFind = args[2] + 1;
//      }
//    }
//
//    int result = (leftFind < rightFind)? leftFind : rightFind;
//
//    return result;
//  }


  public static void main(String... args) {
    System.out.println(findBySort(3, -1, 4, 1));
  }
}
