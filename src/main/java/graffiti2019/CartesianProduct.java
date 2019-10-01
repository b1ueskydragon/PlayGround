package graffiti2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CartesianProduct {

  static class Basic {

    static <T> List<List<T>> product2(List<T> xs, List<T> ys) {
      List<List<T>> product = new ArrayList<>();
      for (T x : xs) {
        for (T y : ys) {
          List<T> chunk = new ArrayList<>() {{ add(x); }};
          chunk.add(y);
          product.add(chunk);
        }
      }
      return product;
    }

  }

  static class ForEach {

    static <T> List<List<T>> product2(List<T> xs, List<T> ys) {
      return new ArrayList<>() {{
        xs.forEach(x -> ys.forEach(y -> add(Arrays.asList(x, y))));
      }};
    }

  }

  static class Functional {

    static <T> List<List<T>> product2(List<T> xs, List<T> ys) {
      return xs.stream().flatMap(x -> ys.stream().map(y -> Arrays.asList(x, y)))
          .collect(Collectors.toList());
    }

  }

}
