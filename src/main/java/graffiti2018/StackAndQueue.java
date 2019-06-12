package graffiti2018;

import java.util.List;
import java.util.NoSuchElementException;

public class StackAndQueue {
  private static class Queue {
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
  }

  private static class Stack {
    private static void push(List<Integer> stack, int el) {
      if (stack.isEmpty()) return;
      stack.add(el);
    }

    private static int pop(List<Integer> stack) {
      if (stack.isEmpty()) throw new NoSuchElementException();
      stack.remove(stack.size() - 1);
      return stack.get(stack.size() - 1);
    }
  }
}
