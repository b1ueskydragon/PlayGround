package quiz;

import java.util.stream.IntStream;

public class StreamChallenge8 {
  public static void main(String[] args) {
    IntStream.iterate(0, i -> i + 2)
        .limit(5)
        .skip(1)
        .takeWhile(i -> i < 10)
        .dropWhile(i -> i > 7)
        .sorted()
        .forEach(System.out::println);
  }
}
