package quiz;

import java.util.stream.IntStream;

public class StreamChallenge7 {

  public static void main(String[] args) {
    /**
     * start 10, predicate, decrement by 2
     */
    IntStream.iterate(10, i -> i >= 0, i -> i - 2) // seed(初期要素) , hasNext(関数), next(関数)
        .filter(i -> i > 5 && i < 10)
        .sorted()
        .forEach(System.out::println);
  }
}
