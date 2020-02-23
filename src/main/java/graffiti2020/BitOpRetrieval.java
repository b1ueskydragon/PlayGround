package graffiti2020;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// TODO migrate to scala.
class BitOpRetrieval {

  static List<String> retrievalAll(final int depth) {
    // if there were 3 digits, 2^3 - 1 will be generated.
    // [001,   011, 010,   111, 110, 101, 100]
    final List<Integer> res = new ArrayList<>();

    // 0 is not selected, 1 is selected.
    // node := (1 << depth) | (selected flag)
    final int resSize = (1 << depth) - 1;

    // well, the list has a bfs-order
    final Deque<Integer> queue = new LinkedList<>();

    // a root is always selected (1)
    queue.addLast(1);

    // not 2 * digit, 2 ^ digit. O(2^N)
    while (res.size() < resSize) {
      int parent = queue.removeFirst();
      queue.addLast((parent << 1) | 1); // left
      queue.addLast(parent << 1); // right
      res.add(parent);
    }

    return convert2BinStrList(res, depth);
  }

  private static List<String> convert2BinStrList(List<Integer> xs, int depth) {
    return xs
        .stream()
        .map(x -> {
          String s = Integer.toBinaryString(x);
          int count = depth - s.length();
          return (count > 0) ? String.format("0".repeat(count) + "%s", s) : s;
        })
        .collect(Collectors.toUnmodifiableList());
  }

}
