package dailyOne.P01;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @challenger b1ueskydragon
 */
public class P01_ON {

  private static <T> Stack<T> createStack(T... args) {
    Stack<T> stack = new Stack<>();
    for (T arg : args) stack.push(arg);
    return stack;
  }

  private static <T> void print(Stack<T> stack) {
    stack.forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  //  O(N) runtime
  //  Since each step is at most O(N). and since we use an extra queue, it takes up O(N) space.
  // For example: Think about make a queue-list(1, 5, 2, 4, 3).
  // And it is a paring of aa queue(5, 4) and stack(3, 2, 1)
  private static <T> Stack<T> interleave(Stack<T> stack) {
    if (stack.isEmpty()) throw new EmptyStackException();

    Queue<T> queue = new LinkedList<>();

    int half = stack.size() / 2;
    int move = (int) Math.ceil(stack.size() / 2.0); // 切り上げ

    while (!stack.isEmpty()) queue.add(stack.pop());  // Move all elements to queue.

    for (int i = 0; i < half; i++) queue.add(queue.poll()); // reverse left-half and right-half of queue.

    for (int i = 0; i < move; i++) stack.push(queue.poll()); // push reversed left-half to stack

    for (int i = 0; i < half; i++) {
      queue.add(stack.pop());  // add a last element of stack to queue
      queue.add(queue.poll()); // add a head element of queue to same queue
    }
    if (!stack.isEmpty()) queue.add(stack.pop());

    while (!queue.isEmpty()) stack.push(queue.poll()); // Move all elements to stack.

    return stack;
  }

  public static void main(String... args) {
    print(interleave(createStack(1, 2, 3, 4, 5)));
    print(interleave(createStack(1, 2, 3, 4)));
    print(interleave(createStack(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)));
    print(interleave(createStack(1, 2, 5, 4, 5, 5, 1, 1, 2, 77, 11, -1, 199, 1)));
  }
}
