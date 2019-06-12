package graffiti;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMapPra {

  private static List<String> getRatingList() {
    return IntStream.rangeClosed(0, 10)
        .mapToDouble(i -> i * 0.5)
        .mapToObj(String::valueOf)
        .collect(Collectors.toList());
  }

  public static void main(String... args) {
    getRatingList().forEach(System.out::println);
  }
}
