package quiz;

import java.util.Arrays;
import java.util.List;

/**
 * takeWhile
 * dropWhile
 *
 * 最初の要素の段階でひっかからないと、何も take || drop されない
 *
 * つまりフィルターではない
 */
public class StreamChallenge8_ {
  public static void main(String[] args) {
    List<Integer> myList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    myList.stream()
        .takeWhile(i -> i % 2 == 0)
        .forEach(System.out::println);

    // 0

    System.out.println("- - - - - - - - - - -");

    List<Integer> moreList = Arrays.asList(0, 2, 3, 4, 5, 6, 7, 8, 9);

    moreList.stream()
        .takeWhile(i -> i % 2 == 0)
        .forEach(System.out::println);

    // 0, 2

    System.out.println("- - - - - - - - - - -");

    List<Integer> oneMoreList = Arrays.asList(2, 4, 6, 8, 10, 11);

    oneMoreList.stream()
        .takeWhile(i -> i % 2 == 0)
        .forEach(System.out::println);

    // 2, 4, 6, 8, 10

    System.out.println("- - - - - - - - - - -");

    List<Integer> anotherList = Arrays.asList(3, 4, 6, 8, 10, 11);

    anotherList.stream()
        .takeWhile(i -> i % 2 == 0)
        .forEach(System.out::println);

    // null

    System.out.println("- - - - - - - - - - -");

    List<Integer> theOtherList = Arrays.asList(1, 3, 5, 7, 9, 12);

    theOtherList.stream()
        .dropWhile(i -> i % 2 == 0)
        .forEach(System.out::println);

    // 1, 3, 5, 7, 9, 12

    System.out.println("- - - - - - - - - - -");

    List<Integer> yourList = Arrays.asList(100, 90, 7, 6, 1);

    yourList.stream()
        .takeWhile(e -> e < 100)
        .dropWhile(e -> e < 50)
        .forEach(System.out::println);

    // null

    System.out.println("- - - - - - - - - - -");

    List<Integer> ourList = Arrays.asList(1, 6, 7, 90, 100);

    ourList.stream()
        .takeWhile(e -> e < 100)
        .dropWhile(e -> e < 50)
        .forEach(System.out::println);

    // 90
  }
}
