package graffiti2019;

import java.util.stream.IntStream;

public class Fib {

  private static int fib(int n) {
    if (n <= 1) return 1;
    else return fib(n - 1) + fib(n - 2);
  }

  // cache = 1
  private static int fibTail(int n, int cache) {
    if (n <= 1) return 1;
    else if (n <= 2) return cache + 1;
    else return fibTail(n - 1, cache + n - 2);
  }

  public static void main(String[] args) {
    IntStream.rangeClosed(0, 5).forEach(i ->
        System.out.print(fib(i) + " ")
    );

    System.out.println();

    IntStream.rangeClosed(0, 5).forEach(i ->
        System.out.print(fibTail(i, 1) + " ")
    );
  }

}
