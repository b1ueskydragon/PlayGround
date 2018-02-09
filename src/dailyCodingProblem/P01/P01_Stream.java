package dailyCodingProblem.P01;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @challenger b1ueskydragon
 * <p>
 * This problem was asked by Google.
 * Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue.
 * This should be done in-place.
 * Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.
 * For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].
 * <p>
 * Hint: Try working backwards from the end state.
 */
public class P01_Stream {

  private static <T> Stack<T> createStack(T... args) {
    Stack<T> stack = new Stack<>();
    for (T arg : args) stack.push(arg);
    return stack;
  }

  private static <T> void print(Stack<T> stack) {
    stack.forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  private static <T> Stack<T> interleave(Stack<T> stack) {
    if (stack.isEmpty()) throw new EmptyStackException();
    Queue<T> queue = new LinkedList<>();

    int oriSize = stack.size();

    // try here

    return stack;
  }

  public static void main(String... args) {
    print(interleave(createStack(1, 2, 3, 4, 5)));
    print(interleave(createStack(1, 2, 3, 4)));
    print(interleave(createStack(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)));
    print(interleave(createStack(1, 2, 5, 4, 5, 5, 1, 1, 2, 77, 11, -1, 199, 1)));
  }
}
