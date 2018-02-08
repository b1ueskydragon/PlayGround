package dailyCodingProblem;


import java.util.LinkedList;
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

  private static Stack<Integer> createStack(int... ii) {
    Stack<Integer> stack = new Stack<>();
    for (int i : ii) stack.push(i);
    return stack;
  }

  private static void interleave(Stack<Integer> stack, Queue<Integer> queue) {

    for (int i = 0; i < stack.size() / 2; i++) {
      queue.add(stack.pop());
    }

    System.out.println("que");
    queue.forEach(System.out::println);

  }

  public static void main(String... args) {

    Stack<Integer> stack = createStack(1, 2, 3, 4);

    interleave(stack, new LinkedList<>());

    System.out.println("sta");
    stack.forEach(System.out::println);
  }
}
