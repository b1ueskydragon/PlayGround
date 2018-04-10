package graffiti2018.shuffle;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class ShuffleCollector {
  public static <T> Collector<T, ?, Stream<T>> shuffle() {
    return shuffle(ThreadLocalRandom::current);
  }

  public static <T> Collector<T, ?, Stream<T>> shuffle(Supplier<Random> random) {
    return Collectors.collectingAndThen(Collectors.toList(),
        ts -> {
          Collections.shuffle(ts, random.get());
          return ts.stream();
        });
  }
}
