package quiz;

import java.util.List;
import java.util.Optional;

public class EvenStreamChallenge {
  public static void main(String [] args) {

    List<Integer> numbers = List.of(1,2,3,4,5,6);

    Optional<Integer> number = numbers.stream()
        .filter(e -> e % 2 ==0)
        .filter(e -> e >= 6)
        .filter(e -> e > 6)
        .map(e -> e * 2)
        .findFirst();

    System.out.println(number);
    System.out.println(number == null);
  }
}
