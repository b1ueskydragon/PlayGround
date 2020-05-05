package leetcode.p0225;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackSpec {
  @Test
  void testPushAndPop() {
    final MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    assertEquals(2, myStack.top());
    assertEquals(2, myStack.pop());
    assertFalse(myStack.empty());
  }

  @Test
  void testPushAfterPop() {
    final MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    assertEquals(2, myStack.top());
    assertEquals(2, myStack.pop());
    myStack.push(3);
    assertEquals(3, myStack.pop());
    assertEquals(1, myStack.pop());
    assertTrue(myStack.empty());
  }

  @Test
  void pushContinuously() {
    final MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    assertEquals(3, myStack.top());
  }
}
