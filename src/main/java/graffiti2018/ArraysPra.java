package graffiti2018;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArraysPra {
  public static void main(String... args) {
    // checkId(3);

    printArgs(new int[]{1, 2, 3});
    printArgs(new Integer[]{1, 2, 3});
  }

  private static void checkId(int id) {
    Integer[] ids = {1, 2};

    if (!Arrays.asList(ids).contains(id)) {
      throw new MyRuntimeException("[MSG] boo! id is = " + id);
    }

    System.out.println("all green.");
  }

  private static class MyRuntimeException extends RuntimeException {
    MyRuntimeException(String message) {
      super(message);
    }
  }

  // 可変長引数の中身を出力する.
  private static <T> void printArgs(T... args) {
    for (T arg : args) System.out.print(arg + " ");
    System.out.println();
  }
}
