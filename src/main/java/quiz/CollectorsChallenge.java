package quiz;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsChallenge {
  public static void main(String... args) {
    Map<Integer, List<Integer>> map = Stream.of(1, 2, 3, 4, 5, 6)
        .collect(Collectors.groupingBy(i -> i % 2,
            Collectors.toList()));

    map.forEach((k, v) -> System.out.println(k + ":" + v));
  }
}
