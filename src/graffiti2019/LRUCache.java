package graffiti2019;

import java.util.*;

public class LRUCache {
  // TODO: generic type

  static Deque<Integer> dq; // store keys of cache
  static HashSet<Integer> map; // store references of key in cache
  static int csize; // maximum capacity of cache

  LRUCache(int n) {
    dq = new LinkedList<>();
    map = new HashSet<>();
    csize = n;
  }

}
