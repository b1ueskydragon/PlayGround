package dailyOne.P04;

import java.util.*;

/**
 * @challenger b1ueskydragon
 * O(N): each data should be searched at only one time.
 * can modify the input array in-place
 */
public class FindLowPosInt {

  private static Integer point = 1; // Tentatively setting: outside scope (is it need?)

  // O(N^2):
  // ・Arrays.contains return indexOf and it contains for-loop of array.
  // ・At each element of the array looking at a part of the entire array again
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
    quickSort(args, 0, args.length -1);
    int len = args.length;

    int buff = len + 1;

    for (int i = 1; i < len + 1; i++) {
      if (args[i - 1] < 1) {
        args[i - 1] = 1;
      }

      if (args[i - 1] != i) {
        buff = i;
      }
    }
    return buff;
  }

  private static Integer[] quickSort(Integer[]ary, int left, int right) {
    int cl = left;
    int cr = right;
    int centerValue = ary[(cl + cr) /2];

    while (cl <= cr) {
      while (ary[cl] < centerValue) cl ++;
      while (centerValue < ary[cr]) cr --;

      if (cl <= cr) {
        int tmp = ary[cl];
        ary[cl] = ary[cr];
        ary[cr] = tmp;
        cl++;
        cr--;
      }
    }

    if (left < cr) quickSort(ary, left, cr);
    if (cl < right) quickSort(ary, cl, right);
    return ary;
  }

  // O(N): Unlike List (List have to search the entire list),
  // Set can be implemented with dic or hash table and it's worst-case performance is O(N).
  private static Integer findBySet(Integer... args) {
    Set<Integer> set = new HashSet<>(Arrays.asList(args)); // TODO HashSet? TreeSet?
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
    System.out.println(findBySet(-100, 100, 100, 100, 99, -99, 0, 1, 2, 4));
    System.out.println();
    System.out.println(findBySort(3, -1, 4, 1));
    System.out.println(findBySort(2, 0, 1));
    System.out.println(findBySort(2, 6, 4, 5, 1, 3));
    System.out.println(findBySet(-100, 100, 100, 100, 99, -99, 0, 1, 2, 4));
  }
}
