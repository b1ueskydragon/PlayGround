package graffiti2020;

import java.util.*;
import java.util.stream.Collectors;

// TODO add a spec, migrate to scala.
public class BitOpRetrieval {

  private static List<Integer> retrievalAll(final int depth) {
    final List<Integer> res = new ArrayList<>();

    // if there were 3 digits, 2^3 - 1.

    // 0 is not selected, 1 is selected.
    // root be always selected (1).
    // so a node can be defined ...
    // node := (1 << depth) | (selected flag)

    // [001,   011, 010,   111, 110, 101, 100]
    final int resSize = (1 << depth) - 1;

    // well, the list has a bfs-order :p
    final Deque<Integer> queue = new LinkedList<>();
    // a root.
    queue.addLast(1);

    // not 2 * digit, 2 ^ digit.
    // O(2^N)
    while (res.size() < resSize) {
      int parent = queue.removeFirst();
      queue.addLast((parent << 1) | 1); // left
      queue.addLast(parent << 1); // right
      res.add(parent);
    }

    return res;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int depth = input.nextInt();

    final List<String> zeroFilledRes = retrievalAll(depth)
        .stream()
        .map(x -> {
          String s = Integer.toBinaryString(x);
          int count = depth - s.length();
          return (count > 0) ? String.format("0".repeat(count) + "%s", s) : s;
        })
        .collect(Collectors.toUnmodifiableList());

    System.out.println(zeroFilledRes);
  }

}
