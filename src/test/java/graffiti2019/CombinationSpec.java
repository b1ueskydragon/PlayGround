package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.List;

import static graffiti2019.Combination.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSpec {

  @Test
  void testDfs() {
    var expected =
        List.of(
            List.of('a', 'b', 'c'),
            List.of('a', 'b', 'd'),
            List.of('a', 'b', 'e'),
            List.of('a', 'b', 'f'),
            List.of('a', 'c', 'd'),
            List.of('a', 'c', 'e'),
            List.of('a', 'c', 'f'),
            List.of('a', 'd', 'e'),
            List.of('a', 'd', 'f'),
            List.of('a', 'e', 'f'),
            List.of('b', 'c', 'd'),
            List.of('b', 'c', 'e'),
            List.of('b', 'c', 'f'),
            List.of('b', 'd', 'e'),
            List.of('b', 'd', 'f'),
            List.of('b', 'e', 'f'),
            List.of('c', 'd', 'e'),
            List.of('c', 'd', 'f'),
            List.of('c', 'e', 'f'),
            List.of('d', 'e', 'f')
        );
    List<Character> xs = List.of('a', 'b', 'c', 'd', 'e', 'f');
    int n = 3;
    assertEquals(expected, combination(xs, n));
    assertEquals(expected, combinationPos(xs, n));
  }

  @Test
  void testBfs() {
    var expected =
        List.of(
            List.of('a', 'b', 'c'),
            List.of('a', 'b', 'd'),
            List.of('a', 'b', 'e'),
            List.of('a', 'b', 'f'),
            List.of('a', 'c', 'd'),
            List.of('a', 'c', 'e'),
            List.of('a', 'c', 'f'),
            List.of('a', 'd', 'e'),
            List.of('a', 'd', 'f'),
            List.of('a', 'e', 'f'),
            List.of('b', 'c', 'd'),
            List.of('b', 'c', 'e'),
            List.of('b', 'c', 'f'),
            List.of('b', 'd', 'e'),
            List.of('b', 'd', 'f'),
            List.of('b', 'e', 'f'),
            List.of('c', 'd', 'e'),
            List.of('c', 'd', 'f'),
            List.of('c', 'e', 'f'),
            List.of('d', 'e', 'f')
        );
    // 6C3
    List<Character> xs = List.of('a', 'b', 'c', 'd', 'e', 'f');
    int n = 3;
    assertEquals(expected, combinationBfs(xs, n));
  }

  @Test
  void testBfsSimplify() {
    var expected =
        List.of(
            List.of('a', 'b'),
            List.of('a', 'c'),
            List.of('b', 'c')
        );
    // 3C2
    var xs = List.of('a', 'b', 'c');
    int n = 2;
    assertEquals(expected, combinationBfs(xs, n));
  }

}
