package graffiti2019;

import java.util.*;

class LRUCache<T> {
  /*
   * Store keys of cache.
   * Most left is newest, most right is an oldest.
   */
  private Deque<T> queue;

  /*
   * Store references of key in cache
   */
  private HashSet<T> refTable;

  /*
   * Maximum capacity of cache
   */
  private static int capacity;

  LRUCache(int n) {
    queue = new LinkedList<>();
    refTable = new HashSet<>();
    capacity = n;
  }

  /**
   * Input
   *
   * @param x key (item)
   */
  void refer(T x) {
    if (!refTable.contains(x)) {
      if (queue.size() == capacity) {
        refTable.remove(queue.removeLast());
      }
    } else { // referred
      queue.removeLast();
    }

    queue.addFirst(x);
    refTable.add(x);
  }

  void debug() { // only to display
    System.out.print("stored: ");
    queue.forEach(x -> System.out.print(x + " "));
    System.out.println();
    System.out.print("referred: ");
    refTable.forEach(x -> System.out.print(x + " "));
    System.out.println();
  }

}
