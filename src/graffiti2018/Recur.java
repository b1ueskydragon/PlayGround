package graffiti2018;

import sort.quick.IntStack;

/**
 * Genuinely Recursive (真に再帰)
 */
public class Recur {
  public static void main(String... args) {
    recur(4);
    System.out.println();
    useStack(4);
  }

  private static void recur(int n) {
    if (n > 0) {
      recur(n - 1);
      System.out.println(n);
      recur(n - 2);
    }
  }

  // current n を一時的に保存(stack)しておき, 取り出す.
  private static void useStack(int n) {
    IntStack stack = new IntStack(n);

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
