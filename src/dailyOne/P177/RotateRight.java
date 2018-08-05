package dailyOne.P177;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * Given a linked list and a positive integer k,
 * rotate the list to the right by k places.
 * [Sample]
 * - input
 * 1 -> 2 -> 3 -> 4 -> 5 and k = 3
 * - output
 * 3 -> 4 -> 5 -> 1 -> 2.
 */
public class RotateRight {
  public static void main(String... args) {
    LinkedList<Integer> given = new LinkedList<>();
    int k;

    // test case
    k = 3;
    int len = 5;
    IntStream.rangeClosed(1, len).forEach(given::add);
    System.out.println(rotateRight(given, k));

    given.clear();

    // test case
    k = 2;
    given.add(7);
    given.add(7);
    given.add(3);
    given.add(5);
    System.out.println(rotateRight(given, k));
  }

  // initial approach
  // (pointer) last -> head, k times
  private static <T> LinkedList<T> rotateRight(LinkedList<T> given, int k) {
    IntStream.range(0, k).forEach(i -> given.addFirst(given.removeLast()));
    return given;
  }
}
