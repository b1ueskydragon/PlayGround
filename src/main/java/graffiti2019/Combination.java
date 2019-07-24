package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Combination {

  static <T> List<List<T>> combination_(List<T> xs, int n) {
    List<List<T>> res = new ArrayList<>();
    var len = xs.size();
    Deque<List<T>> queue = new LinkedList<>() {{
      add(new ArrayList<>());
    }};

    for (var i = 0; i <= len; i++) {
      System.out.println(queue);
      for (var j = 0; j < (1 << i); j++) {
        var parent = queue.removeFirst();

        var x = i;
        var leftChild = new ArrayList<>(parent) {{
          add(xs.get(x));
        }};
        var rightChild = new ArrayList<>(parent);

        queue.addLast(leftChild);
        queue.addLast(rightChild);
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
