package dailyCodingProblem.P01;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
  private static <T> Stack<T> interleave(Stack<T> stack) {
    if (stack.isEmpty()) throw new EmptyStackException();
    Queue<T> queue = new LinkedList<>();




    return stack;
  }

  public static void main(String... args) {
    print(interleave(createStack(1, 2, 3, 4, 5)));
    print(interleave(createStack(1, 2, 3, 4)));
    print(interleave(createStack(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)));
    print(interleave(createStack(1, 2, 5, 4, 5, 5, 1, 1, 2, 77, 11, -1, 199, 1)));
  }
}
