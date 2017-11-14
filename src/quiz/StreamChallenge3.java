package quiz;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamChallenge3 {

  public static void main(String[] args) {
    OptionalInt reduced = IntStream.range(4, 1).reduce((a, b) -> a + b);

    System.out.println(reduced.getAsInt());
  }
}
