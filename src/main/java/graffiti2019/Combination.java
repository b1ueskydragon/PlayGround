package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;

class Combination {
  // cut-off: discard retrieval before generate all elements.
  static <T> List<List<T>> combinationBfs(final List<T> xs, final int n) {
    // much memory is used than DFS
    Deque<List<T>> queue = new LinkedList<>() {{
      add(new ArrayList<>());
    }};
    List<List<T>> res = new ArrayList<>();
    int d = 0;
    while (d < xs.size()) {
      T seed = xs.get(d);
      for (int b = 0; b < (1 << d); b++) { // retrieval breadth
        List<T> curr = queue.removeFirst();
        List<T> currAcc = new ArrayList<>(curr) {{
          add(seed);
        }};
        if (currAcc.size() == n) res.add(currAcc);
        queue.addLast(currAcc);
        queue.addLast(curr);
      }
      d++;
    }
    // System.out.printf("(%s, %s)", queue.size(), queue);
    return res;
  }

  static <T> List<List<T>> combination(List<T> xs, int n) {
    List<List<T>> res = new ArrayList<>();

    class Dfs {
      private void generate(List<T> xs, List<T> ps) {
        int k = ps.size();
        if (xs.isEmpty() && k < n) return;
        if (k < n) {
          List<T> tail = xs.subList(1, xs.size());
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
