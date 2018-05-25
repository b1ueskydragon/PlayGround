package quiz99;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class P28 {
  public static void main(String... args) {
    final List<List<String>> given = new ArrayList<>() {{
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

    lsort(given).forEach(System.out::println);
  }

  /**
   * Sort by each length.
   *
   * @param <T>      Type
   * @param listList given
   * @return return a new list (sorted)
   */
  private static <T> List<HashMap<T, Integer>> lsort(List<List<T>> listList) {
    return listList.stream().map(ls -> new HashMap<T, Integer>() {{put((T)ls, ls.size());}}).collect(Collectors.toList());
  }
}
