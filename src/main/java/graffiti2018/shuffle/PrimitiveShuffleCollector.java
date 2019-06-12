package graffiti2018.shuffle;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PrimitiveShuffleCollector {
  private static void printRandom(int from, int upto, Supplier<Random> randomSupplier) {
    int[] shuffled = IntStream.range(from, upto)
        .boxed()
        .collect(ShuffleCollector.shuffle(randomSupplier))
        .limit(5)
        .mapToInt(Integer::intValue)
        .toArray();

    System.out.println(Arrays.toString(shuffled));
  }

  public static void main(String... args) {
    printRandom(0, 10, ThreadLocalRandom::current);
    printRandom(0, 10, () -> new Random(0));
  }
}
