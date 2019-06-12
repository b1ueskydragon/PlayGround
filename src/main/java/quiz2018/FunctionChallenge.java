package quiz2018;

import java.util.Comparator;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FunctionChallenge {

  public static void main(String... args) {
    String starWars = "Luke DarthVader ObiWan QuiGonJinn Palpatine";

    Function<String, Stream<String>> lineSplitter =
        l -> Pattern.compile(" ").splitAsStream(l);

    Stream.of(starWars)
        .flatMap(lineSplitter)
        // .sorted((o1, o2) -> o2.compareTo(o1))
        .sorted(Comparator.reverseOrder()) // same as above
        .forEachOrdered(System.out::println);
  }
}
