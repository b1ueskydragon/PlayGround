package quiz;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamChallenge3 {

  public static void main(String[] args) {
    // 出力される例
    OptionalInt _reduced = IntStream.range(1, 4).reduce((a, b) -> a + b);

    System.out.println(_reduced.getAsInt());

    // 本題
    OptionalInt reduced = IntStream.range(4, 1).reduce((a, b) -> a + b);

    System.out.println(reduced.getAsInt());
  }
}
