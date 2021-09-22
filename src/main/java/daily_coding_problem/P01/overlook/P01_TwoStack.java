package daily_coding_problem.P01.overlook;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

import static daily_coding_problem.CommonUtils.*;

/**
 * @challenger b1ueskydragon
 */
public class P01_TwoStack {
  private static <T> Stack<T> interleave(Stack<T> stack) {
    if (stack.isEmpty()) throw new NoSuchElementException();
    if (stack.size() == 1) return stack;

    int oriSize = stack.size();

    // only one other queue.
    Queue<T> queue = new LinkedList<>();
    // another Stack
    Stack<T> buffStack = new Stack<>();

    // Using 'oriSize' helps to prevent side-effect ('stack' size is continuously modified in this loop).
    for (int i = 0; i < oriSize / 2; i++) {
      queue.add(stack.pop());
    }

    while (stack.size() > 1) {
      buffStack.push(stack.pop());
    }

    while (true) {
      if (stack.size() == oriSize) break;
      if (!queue.isEmpty()) stack.push(queue.poll());
      if (!buffStack.isEmpty()) stack.push(buffStack.pop());
    }

    return stack;
  }

  public static void main(String... args) {
    printStack(interleave(createStack(1, 2, 3, 4, 5)));
    printStack(interleave(createStack(1, 2, 3, 4)));
    printStack(interleave(createStack(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)));
    printStack(interleave(createStack(1, 2, 5, 4, 5, 5, 1, 1, 2, 77, 11, -1, 199, 1)));
  }
}
