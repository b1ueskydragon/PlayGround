package dailyOne.P177;

import java.util.LinkedList;
import java.util.Scanner;
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
    Scanner sc = new Scanner(System.in);

    LinkedList<Integer> given = new LinkedList<>();
    System.out.println("input length");
    int len = sc.nextInt();
    System.out.println("input elements");
    IntStream.range(0, len).forEach(i -> given.add(sc.nextInt()));
    System.out.println("input rotation counter");
    int k = sc.nextInt();

    System.out.println(rotateRight(given, k));
    sc.close();
  }

  // initial approach
  // (pointer) last -> head, k times
  private static <T> LinkedList<T> rotateRight(LinkedList<T> given, int k) {
    IntStream.range(0, k).forEach(i -> given.addFirst(given.removeLast()));
    return given;
  }

  // TODO (len - k) left rotate logic.
}
