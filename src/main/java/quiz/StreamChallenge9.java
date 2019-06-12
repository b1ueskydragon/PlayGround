package quiz;

import java.util.List;
import java.util.stream.Collectors;

public class StreamChallenge9 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 3, 5, 7, 10); // immutable list

    numbers.addAll(numbers.stream()
        .filter(i -> i > 10) // size changed
        .collect(Collectors.toList()));

    numbers.forEach(System.out::println); // ImmutableCollections -> UnsupportedOperationException
  }
}
