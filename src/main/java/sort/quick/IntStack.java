package sort.quick;

public class IntStack {
  // capacity of stack
  private int max;

  // pointer of stack
  private int pointer;

  // a stack
  private int[] stack;

  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {
    }
  }

  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {
    }
  }

  public IntStack(int capacity) {
    /*
     * init settings.
     */
    pointer = 0;
    max = capacity;

    try {
      stack = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public int push(int x) throws OverflowIntStackException {
    if (pointer >= max) throw new OverflowIntStackException();
    return stack[pointer++] = x;
  }

  public int pop() throws EmptyIntStackException {
    if (pointer <= 0) throw new EmptyIntStackException();
    return stack[--pointer];
  }

  public void clear() {
    pointer = 0;
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return pointer;
  }

  public boolean isEmpty() {
    return pointer <= 0;
  }

  public boolean isFull() {
    return pointer >= max;
  }

  // stack の頂上から線形探索
  public int indexOf(int x) {
    for (int i = pointer - 1; i >= 0; i--) {
      if (stack[i] == x) return i;
    }
    return -1;
  }
}
