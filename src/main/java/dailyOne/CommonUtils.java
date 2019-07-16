package dailyOne;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

@SuppressWarnings("unchecked")
public class CommonUtils {
  public static <T> Stack<T> createStack(T... args) {
    Stack<T> stack = new Stack<>();
    for (T arg : args) stack.push(arg);
    return stack;
  }

  public static <T> void printStack(Stack<T> stack) {
    stack.forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }

  public static int[] createIntAry(int... args) {
    int[] ary = new int[args.length];
    IntStream.range(0, args.length).forEach(i -> ary[i] = args[i]);
    return ary;
  }

  public static void printAry(int[] ary) {
    Arrays.stream(ary).forEach(el -> System.out.printf(el + " ", el));
    System.out.print(System.getProperty("line.separator"));
  }
}
