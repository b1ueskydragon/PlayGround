package graffiti2019;

import java.util.ArrayList;
import java.util.List;

class SubSet {
  /** Bit-op */
  static <T> List<List<T>> generate(List<T> xs) {
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
  static void generate(String xs, int pos, String ps) {
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
