package graffiti2020;

import java.util.ArrayList;
import java.util.List;

// TODO add a spec, migrate to scala.
public class BitOpRetrieval {

  private static final List<String> res = new ArrayList<>();

  // TODO set params.
  private static void retrievalAll() {
    // if there were 3 digits, 2^3 - 1.

    // 0 is not selected, 1 is selected.
    // root be always selected (1).
    // so a node can be defined ...
    // node := (1 << depth) | (selected flag)

    // [001,   011, 010,   111, 110, 101, 100]
    // well, the list has a bfs-order :p
    final int depth = 3;

    // TODO Add a root.

    // not 2 * digit, 2 ^ digit.
    // O(2^N)
    for (int i = 1; i < depth; i++) {
      final int seed = 1 << i;
      int selectFlag = 1;
      int nonSelectFlag = 0;
      for (int j = i; j < seed; j++) {
        res.add(Integer.toBinaryString(seed | selectFlag)); // left
        res.add(Integer.toBinaryString(seed | nonSelectFlag)); // right
        selectFlag <<= 1;
        nonSelectFlag = (int) Math.pow(2, j);
      }
    }

  }

  public static void main(String[] args) {
    retrievalAll();
    System.out.println(res);
  }

}
