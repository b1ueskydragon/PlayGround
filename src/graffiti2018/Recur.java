package graffiti2018;

import sort.quick.IntStack;

public class Recur {
  public static void main(String... args) {
    final int n = 4;
    recur(n);
    System.out.println();
    recur_(n);
    System.out.println();
    useStack(n);

  }

  /**
   * Genuinely Recursive.
   * 真に再帰.
   */
  private static void recur(int n) {
    if (n > 0) {
      recur(n - 1);
      System.out.println(n);
      recur(n - 2);
    }
  }

  /**
   * Remove a tail recursion.
   * 末尾再帰の除去.
   */
  private static void recur_(int n) {
    while (n > 0) {
      recur_(n - 1);
      System.out.println(n);
      n -= 2;
    }
  }

  /**
   * temperately stack current n, then pull it out.
   * current n を一時的に保存(stack)しておき, 取り出す.
   */
  private static void useStack(int n) {
    IntStack stack = new IntStack(n); // same as Stack<Integer>

    while (true) {
      if (n > 0) {
        stack.push(n);
        n -= 1;
        continue; // while の先頭に戻る
      }
      if (!stack.isEmpty()) {
        n = stack.pop();
        System.out.println(n);
        n -= 2;
        continue; // while の先頭に戻る
      }
      break;
    }
  }
}
