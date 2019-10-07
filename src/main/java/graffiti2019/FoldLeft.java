package graffiti2019;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FoldLeft {

  static class BasicRecursion {

    static <T, U> U foldLeft(List<T> seq, U acc, BiFunction<U, T, U> f) {
      if (seq.isEmpty()) return acc;
      else return foldLeft(seq.subList(1, seq.size()), f.apply(acc, seq.get(0)), f);
    }

  }

  static class BasicLoop {

    static <T, U> U foldLeft(List<T> seq, U acc, BiFunction<U, T, U> f) {
      for (T t : seq) acc = f.apply(acc, t);
      return acc;
    }

  }

  static class WithCollectors {

    static <T, U> Collector<T, ?, U> foldLeft(
        final U init,
        final BiFunction<? super U, ? super T, ? extends U> f
    ) {
      return Collectors.collectingAndThen(
          Collectors.reducing(Function.<U>identity(), t -> u -> f.apply(u, t), Function::andThen),
          acc -> acc.apply(init)
      );
    }

  }

}
