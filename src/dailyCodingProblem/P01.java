package dailyCodingProblem;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

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

  // TODO : Use WildCard or Type Parameter
  // TODO : Add Test

  private static Stack<Integer> createStack(int... ii) {
    Stack<Integer> stack = new Stack<>();
    for (int i : ii) stack.push(i);
    return stack;
  }

  private static <T> void print(Stack<T> stack) {
    stack.forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  private static Stack<Integer> interleave(Stack<Integer> stack) {
    if (stack.isEmpty()) throw new NoSuchElementException();
    if (stack.size() == 1) return stack;

    int oriSize = stack.size();

    // only one other queue.
    Queue<Integer> queue = new LinkedList<>();
    // another Stack
    Stack<Integer> buffStack = new Stack<>();

    // Using 'oriSize' helps to prevent side-effect ('stack' size is continuously modified in this loop).
    for (int i = 0; i < oriSize / 2; i++) {
      queue.add(stack.pop());
    }

    int tmpSize = stack.size(); // size of 'stack' at this point in loop (using stack.size() and erase decrement is ok in this case).
    while (true) {
      if (tmpSize == 1) break;
      buffStack.push(stack.pop());
      tmpSize--;
    }

    while (true) {
      if (stack.size() == oriSize) break;
      if (!queue.isEmpty()) stack.push(queue.poll());
      if (!buffStack.isEmpty()) stack.push(buffStack.pop());
    }

    return stack;
  }

  public static void main(String... args) {
    print(interleave(createStack(1, 2, 3, 4, 5)));
    print(interleave(createStack(1, 2, 3, 4)));
    print(interleave(createStack(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)));
    print(interleave(createStack(1, 2, 5, 4, 5, 5, 1, 1, 2, 77, 11, -1, 199, 1)));
  }
}
