package dailyCodingProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This problem was asked by Google.
 * Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue.
 * This should be done in-place.
 * Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.
 * For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].
 * Hint: Try working backwards from the end state.
 */
public class P01 {

  // TODO Make method.
  private static final List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

  /*
   * Stack
   */
  private static void push(List<Integer> stack, int el) {
    if (stack.isEmpty()) return;

    stack.add(el);
  }

  private static int pop(List<Integer> stack) {
    if (stack.isEmpty()) throw new NoSuchElementException();

    stack.remove(stack.size() - 1);

    return stack.get(stack.size() - 1);
  }

  /*
   * Queue
   */
  private static void enqueue(List<Integer> queue, int el) {
    if (queue.isEmpty()) return;

    queue.add(0, el);
  }

  private static int dequeue(List<Integer> queue) {
    if (queue.isEmpty()) throw new NoSuchElementException();

    Integer result = queue.get(0);

    queue.remove(0);

    return result;
  }


  private static int[] interleave(int[] ary) {

    return ary;
  }

  public static void main(String... args) {

  }
}
