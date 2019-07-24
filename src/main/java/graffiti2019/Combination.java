package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Combination {

  static <T> List<List<T>> combinationBfs(List<T> xs, int n) {
    Deque<List<T>> queue = new LinkedList<>() {{
      add(new ArrayList<>());
    }};
    var i = 0;

    while (!queue.isEmpty() && i < xs.size()) {
      var currNode = xs.get(i);
      for (var j = 0; j < (1 << i); j++) {
        var parent = queue.removeFirst();
        var leftChild = new ArrayList<>(parent) {{
          add(currNode);
        }};
        var rightChild = new ArrayList<>(parent);

        if (leftChild.size() <= n) queue.addLast(leftChild);
        if (rightChild.size() <= n) queue.addLast(rightChild);
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

}
