package graffiti2019;

public class LRUCacheApp {
  public static void main(String... args) {
    final int maxSize = 2;
    LRUCache cache = new LRUCache(maxSize);

    cache.set(1, 2);
    cache.set(2, 5);
    cache.set(3, 6);
    cache.set(4, 7);
    cache.set(1, 4);

    System.out.println(cache.get(2)); // 5
    System.out.println(cache.get(3)); // 6

    System.out.println(cache.get(1)); // TODO -1

  }
}
