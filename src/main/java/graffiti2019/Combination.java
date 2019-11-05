
package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class Combination {

  static <T> List<List<T>> combinationBfs(List<T> xs, int n) {
    Deque<List<T>> queue = new LinkedList<>() {{
      add(new ArrayList<>());
    }};
    var i = 0;
    while (i < xs.size()) {
      var currNode = xs.get(i);
      for (var j = 0; j < (1 << i); j++) {
        var parent = queue.remove();
        var child = new ArrayList<>(parent) {{
          add(currNode);
        }};

        // child after append a current node to a parent.
        queue.add(child);

        // another child is the parent that does not append a current node.
        // same as parent itself.
        queue.add(parent);
      }
      i += 1;
    }
    return queue.stream().filter(t -> t.size() == n)
        .collect(Collectors.toList());
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

  static <T> List<List<T>> combinationPos(List<T> xs, int n) {
    List<List<T>> res = new ArrayList<>();

    class Dfs {
      private void generate(int pos, List<T> ps) {
        if (ps.size() == n) {
          res.add(ps);
          return;
        }
        if (xs.size() - pos + ps.size() >= n) {
          List<T> nps = new ArrayList<>(ps);
          nps.add(xs.get(pos));
          generate(pos + 1, nps);
          generate(pos + 1, ps);
        }
      }
    }

    new Dfs().generate(0, new ArrayList<>());
    return res;
  }

}
