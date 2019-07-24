package graffiti2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class SubSet {
  /** BFS */
  static <T> List<List<T>> generateWithDq(List<T> xs) {
    Deque<List<T>> queue = new LinkedList<>() {{
      add(new ArrayList<>());
    }};

    for (var i = 0; i < xs.size(); i++) {
      var currNode = xs.get(i);

      for (var j = 0; j < (1 << i); j++) { // OUT one and IN two, per 1 loop
        var parent = queue.removeFirst();
        var leftChild = new ArrayList<>(parent) {{
          add(currNode);
        }};
        var rightChild = new ArrayList<>(parent);

        queue.addLast(leftChild);
        queue.addLast(rightChild);
      }
    }
    return new ArrayList<>(queue);
  }

  /** Bit-op */
  static <T> List<List<T>> generateWithBitwise(List<T> xs) {
    var ps = new ArrayList<List<T>>();
    var len = xs.size();
    long breadth = 1 << len;

    for (var i = 0; i < breadth; i++) {
      var chunk = new ArrayList<T>();  // init 2^N times
      for (var j = 0; j < len; j++) {
        if ((i & (1 << j)) > 0) chunk.add(xs.get(j));
      }
      ps.add(chunk);
    }
    return ps;
  }

  /** Recursion (DFS) */
  private static void generate(String xs, int pos, String ps) {
    if (pos == xs.length()) {
      System.out.println(ps);
      return;
    }
    generate(xs, pos + 1, ps);
    var head = xs.charAt(pos);
    generate(xs, pos + 1, head + ps);
  }

  public static void main(String[] args) {
    var xs = "abc";
    SubSet.generate(xs, 0, "");
  }

}
