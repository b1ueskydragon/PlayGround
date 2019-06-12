package quiz2018;

import java.util.stream.Stream;

public class StreamWhileChallenge {

  public static void main(String... args) {
    String sopranos = "<Tony,Junior,Christoper>";

    Stream.of(sopranos).dropWhile(s -> !s.contains("<"))
        .takeWhile(s -> !s.contains(">"))
        .forEach(s -> System.out.println(s));
  }
}
