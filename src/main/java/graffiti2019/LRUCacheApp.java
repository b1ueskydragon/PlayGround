package graffiti2019;

public class LRUCacheApp {
  public static void main(String... args) {
    final int maxSize = 4;
    LRUCache<Integer> cache = new LRUCache<>(maxSize);
    cache.refer(1);
    cache.refer(2);
    cache.refer(3);
    cache.refer(1);
    cache.debug();
    cache.refer(4);
    cache.debug();
    cache.refer(5);
    cache.debug();
  }
}
