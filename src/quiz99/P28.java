package quiz99;

import java.util.ArrayList;
import java.util.List;

public class P28 {
  public static void main(String... args) {
    lsort(Given.lists).forEach(p -> System.out.println(p._1()));
  }

  /**
   * Sort by each length.
   *
   * @param <T>   Type
   * @param lists given
   * @return return a new list (sorted)
   */
  private static <T> List<Tuple<List<T>, Integer>> lsort(List<List<T>> lists) {

    List<Tuple<List<T>, Integer>> pairs = new ArrayList<>();

    for (List<T> list : lists) {
      pairs.add(new Tuple<>(list, list.size()));
    }

    return pairs;
  }
}

/**
 * Pairs
 *
 * @param <T> Type 1
 * @param <V> Type 2
 */
class Tuple<T, V> {
  private final T t;
  private final V v;

  Tuple(T t, V v) {
    this.t = t;
    this.v = v;
  }

  public T _1() {
    return t;
  }

  public V _2() {
    return v;
  }
}

/**
 * Sample datum
 */
class Given {
  static final List<List<String>> lists = new ArrayList<>() {{
    add(new ArrayList<>() {{
          add("a");
          add("b");
          add("c");
        }}
    );
    add(new ArrayList<>() {{
          add("d");
          add("e");
        }}
    );
    add(new ArrayList<>() {{
          add("f");
          add("g");
          add("h");
        }}
    );
    add(new ArrayList<>() {{
          add("d");
          add("e");
        }}
    );
    add(new ArrayList<>() {{
          add("i");
          add("j");
          add("j");
          add("k");
          add("l");
        }}
    );
    add(new ArrayList<>() {{
          add("m");
          add("n");
        }}
    );
    add(new ArrayList<>() {{
          add("o");
        }}
    );
  }};
}