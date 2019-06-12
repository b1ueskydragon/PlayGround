package quiz;

import java.util.List;
import java.util.Optional;

public class OptionalChallenge4 {

  public static void main(String[] args) {
    List<Integer> list = List.of(10, 1, 3, 5, 7, 9);

    Optional<Integer> number =
        list.stream()
            .takeWhile(i -> i > 5)
            .dropWhile(i -> i > 9)
            .findFirst()
            .or(() -> Optional.of(777));

    System.out.println(number);


    Optional<Integer> test =
        list.stream()
            .dropWhile(i -> i > 9)
            .findFirst()
            .or(() -> Optional.of(1));

    System.out.println(test);

    list.stream()
        .takeWhile(i -> i > 5)
        //.dropWhile(i -> i > 9)
        .forEach(System.out::println);
  }
}
