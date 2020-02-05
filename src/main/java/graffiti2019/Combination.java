
package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;

class Combination {
  // cut-off: discard retrieval before generate all elements.
  static <T> List<List<T>> combinationBfs(final List<T> xs, final int n) {
    Deque<T> remDepth = new LinkedList<>(xs);
    Deque<List<T>> res = new LinkedList<>();

    res.addLast(new ArrayList<>());
    int d = 0; // current position of generate head from xs
    while (!remDepth.isEmpty()) {
      T x = remDepth.removeFirst();
      for (int b = 0; b < (1 << d); b++) { // breadth b
        List<T> curr = res.removeFirst();
        if (curr.size() > n) continue; // cut-off

        // TODO one more cut-off. append eventually `curr` is necessary for the next.

        List<T> accCurr = new ArrayList<>(curr);

        // append children
        if (accCurr.size() < n) { // cut-off
          accCurr.add(x);
          res.add(accCurr);
        }
        res.add(curr);
      }
      d += 1;
    }
    return new ArrayList<>(res);
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

    // side-effect
    BiConsumer<Integer, List<T>> dfs = new BiConsumer<>() {
      @Override
      public void accept(Integer pos, List<T> ps) {
        if (ps.size() == n) {
          res.add(ps);
          return;
        }
        if (xs.size() - pos + ps.size() >= n) {
          List<T> nps = new ArrayList<>(ps);
          nps.add(xs.get(pos));
          accept(pos + 1, nps);
          accept(pos + 1, ps);
        }
      }
    };

    dfs.accept(0, new ArrayList<>());
    return res;
  }

}
