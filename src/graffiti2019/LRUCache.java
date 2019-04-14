package graffiti2019;

import java.util.*;

// TODO: generic type
public class LRUCache {
  private static Deque<Integer> queue; // store keys of cache
  private static HashMap<Integer, Integer> map; // store references of key in cache
  private static int capacity; // maximum capacity of cache

  LRUCache(int n) {
    queue = new LinkedList<>();
    map = new HashMap<>();
    capacity = n;
  }

  /**
   * Sets the value of the key x with value y
   * If the cache reaches its capacity,
   * invalidate the least recently map item
   *
   * @param x key
   * @param y value
   */
  void set(int x, int y) {
    // invalidate the least recently map item
    if (map.size() == capacity) {
      for (int key : queue) {
        if (!map.containsKey(key)) {
          int last = queue.removeLast();
          map.remove(last);
        }
      }
    }

    queue.addFirst(x); // inserting the new item at the head
    capacity++;

    map.put(x, y);
  }

  /**
   * Reference and get item
   *
   * @param x key
   * @return the value of the x if present else -1
   */
  int get(int x) {
    if (map.containsKey(x) && queue.contains(x)) {
      queue.add(x); // store references of key at the end

      capacity--;
      return map.get(x);
    }

    return -1; // not present
  }

}
