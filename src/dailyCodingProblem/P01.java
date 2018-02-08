package dailyCodingProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * This problem was asked by Google.
 * Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue.
 * This should be done in-place.
 * Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.
 * For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].
 * <p>
 * Hint: Try working backwards (訳: 逆向き解決法 ?) from the end state.
 */
public class P01 {
  private static final List<Integer> TESTLIST = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
  private static final int SIZE = TESTLIST.size();

  private static List<Integer> interleave(List<Integer> list) {
    if (list.isEmpty()) throw new NoSuchElementException();

    List<Integer> firstHalf = new ArrayList<>();
    List<Integer> secondHalf = new ArrayList<>();

    if (SIZE % 2 == 0) {
      int centerIdx = list.size() / 2 - 1;

      // First half: indexes that consumed by pop.
      for (int i = 0; i <= centerIdx; i++) {
        firstHalf.add(list.get(i));
      }

      // Second half: indexes that consumed by dequeue.
      for (int i = list.size() - 1; i >= centerIdx; i--) {
        secondHalf.add(list.get(i));
      }
    } else {
      int centerIdx = list.size() / 2;

      // First half: indexes that consumed by pop.
      for (int i = 0; i < centerIdx; i++) {
        firstHalf.add(list.get(i));
      }

      // Second half: indexes that consumed by dequeue.
      for (int i = list.size() - 1; i > centerIdx; i--) {
        secondHalf.add(list.get(i));
      }
    }



    return merge(firstHalf, secondHalf);
  }

  private static List<Integer> merge(List<Integer> firstHalf, List<Integer> secondHalf) {
    List<Integer> result = new ArrayList<>();

    result.add(firstHalf.get(0));
    result.add(secondHalf.get(0));
    result.add(firstHalf.get(1));
    result.add(secondHalf.get(1));


    return result;
  }

  public static void main(String... args) {
    interleave(TESTLIST).forEach(System.out::println);
  }
}
