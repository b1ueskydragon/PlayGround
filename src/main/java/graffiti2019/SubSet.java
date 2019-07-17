package graffiti2019;

import java.util.ArrayList;
import java.util.List;

class SubSet {
  /** Bit-op */
  static <T> List<List<T>> generate(List<T> xs) {
    var ps = new ArrayList<List<T>>();
    var N = xs.size();
    var resN = (long) Math.pow(2, N);

    for (var i = 0; i < resN; i++) {   // [Ø, a, b, ab, c, ac, bc, abc]
      var chunk = new ArrayList<T>();  // init 2^N times
      for (var j = 0; j < N; j++) {    // [a, b, c]
        if ((i & (1 << j)) > 0) chunk.add(xs.get(j));
      }
      ps.add(chunk);
    }
    return ps;
  }
}
