package daily_coding_problem.P01;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static daily_coding_problem.CommonUtils.*;

/**
 * @challenger b1ueskydragon
 */
public class P01_ON2 {
  //  O(N^2) runtime
  //  : cause runs through the stack and for each pass, runs through a part of the stack.
  private static <T> Stack<T> interleave(Stack<T> stack) {
    if (stack.isEmpty()) throw new EmptyStackException();
    Queue<T> queue = new LinkedList<>();

    int oriSize = stack.size();
    int base = 1;
    while (oriSize > base) {
      while (stack.size() > base) queue.add(stack.pop());
      while (queue.size() > 0) stack.push(queue.poll());
      base++;
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
