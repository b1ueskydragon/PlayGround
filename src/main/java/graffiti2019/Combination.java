package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;

class Combination {
  // cut-off: discard retrieval before generate all elements.
  static <T> List<List<T>> combinationBfs(final List<T> xs, final int n) {
    Deque<List<T>> res = new LinkedList<>() {{
      addLast(new ArrayList<>());
    }};

    int d = 0; // current position of generate head from xs
    int rem = xs.size() - d;

    while (rem > 0) {
      T x = xs.get(d);
      for (int b = 0; b < (1 << d); b++) { // breadth b
        List<T> curr = res.removeFirst(); // parent
        if (curr.size() + rem < n) {
          continue; // cannot generate a proper length
        }
        if (curr.size() < n) {
          List<T> accCurr = new ArrayList<>(curr) {{
            add(x);
          }};
          res.addLast(accCurr); // left
        }
        if (d < n) {
          res.addLast(curr); // right
        }
      }
      System.out.println(res);

      d += 1;
      rem -= 1;
    }
    return new ArrayList<>(res);
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
