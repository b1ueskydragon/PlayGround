package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Combination {

  static <T> List<List<T>> combination_(List<T> xs, int n) {

    List<List<T>> res = new ArrayList<>();

    Deque<List<T>> lookup = new LinkedList<>() {{
      add(new ArrayList<>());
    }};
    var pos = 0;

    while (pos < xs.size()) {
      List<T> currLeft = new ArrayList<>();
      List<T> currRight = new ArrayList<>();
      if (!lookup.isEmpty()) currLeft = lookup.removeFirst();
      if (!lookup.isEmpty()) currRight = lookup.removeFirst();

      var currElem = xs.get(pos);

      lookup.add(new ArrayList<>(currLeft) {{
        add(currElem);
      }});
      lookup.add(currLeft);

      lookup.add(new ArrayList<>(currRight) {{
        add(currElem);
      }});
      lookup.add(currRight);

      pos += 1;

      for (List<T> each: lookup) {
        if (each.size() == n) res.add(each);
      }
    }

    return res;
  }

  static <T> List<List<T>> combination(List<T> xs, int n) {
    var res = new ArrayList<List<T>>();

    class Dfs {
      private void generate(List<T> xs, List<T> ps) {
        var k = ps.size();
        if (xs.isEmpty() && k < n) return;
        if (k < n) {
          var tail = xs.subList(1, xs.size());
          generate(tail, new ArrayList<>(ps) {{
            add(xs.get(0));
          }});
          generate(tail, ps);
        } else res.add(ps); // since k == n at this point
      }
    }

    new Dfs().generate(xs, new ArrayList<>());
    return res;
  }

}
