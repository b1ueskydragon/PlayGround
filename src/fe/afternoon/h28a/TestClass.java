package fe.afternoon.h28a;

import java.util.Stack;

public enum TestClass {

  DIGIT0, DIGIT1, DIGIT2, DIGIT3, DIGIT4,
  DIGIT5, DIGIT6, DIGIT7, DIGIT8, DIGIT9;

  public void operateOn(Stack<Integer> stack) {
    stack.push(stack.pop() * 10 + ordinal());
  }

  public static void main(String...args) {
    Stack<Integer> stack =  new Stack<>();
    stack.push(2);
    stack.push(stack.pop() * 10 + TestClass.DIGIT2.ordinal());
    System.out.println(stack.peek());

  }
}
