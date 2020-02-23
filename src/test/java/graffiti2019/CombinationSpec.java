package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.List;

import static graffiti2019.Combination.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSpec {

  @Test
  void testDfs6C3() {
    final var expected =
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
    final List<Character> xs = List.of('a', 'b', 'c', 'd', 'e', 'f');
    final int n = 3;
    assertEquals(expected, combination(xs, n));
    assertEquals(expected, combinationPos(xs, n));
  }

  @Test
  void testBfs6C3() {
    final var expected =
        List.of(
            List.of('a', 'b', 'c'),
            List.of('a', 'b', 'd'),
            List.of('a', 'c', 'd'),
            List.of('b', 'c', 'd'),
            List.of('a', 'b', 'e'),
            List.of('a', 'c', 'e'),
            List.of('a', 'd', 'e'),
            List.of('b', 'c', 'e'),
            List.of('b', 'd', 'e'),
            List.of('c', 'd', 'e'),
            List.of('a', 'b', 'f'),
            List.of('a', 'c', 'f'),
            List.of('a', 'd', 'f'),
            List.of('a', 'e', 'f'),
            List.of('b', 'c', 'f'),
            List.of('b', 'd', 'f'),
            List.of('b', 'e', 'f'),
            List.of('c', 'd', 'f'),
            List.of('c', 'e', 'f'),
            List.of('d', 'e', 'f')
        );
    final List<Character> xs = List.of('a', 'b', 'c', 'd', 'e', 'f');
    final int n = 3;
    assertEquals(expected, combinationBfs(xs, n));
  }

  @Test
  void testBfs3C2() {
    final var expected =
        List.of(
            List.of('a', 'b'),
            List.of('a', 'c'),
            List.of('b', 'c')
        );
    final List<Character> xs = List.of('a', 'b', 'c');
    final int n = 2;
    assertEquals(expected, combinationBfs(xs, n));
  }

  @Test
  void testBfs6C2() {
    final var expected =
        List.of(
            List.of('a', 'b'),
            List.of('a', 'c'),
            List.of('b', 'c'),
            List.of('a', 'd'),
            List.of('b', 'd'),
            List.of('c', 'd'),
            List.of('a', 'e'),
            List.of('b', 'e'),
            List.of('c', 'e'),
            List.of('d', 'e'),
            List.of('a', 'f'),
            List.of('b', 'f'),
            List.of('c', 'f'),
            List.of('d', 'f'),
            List.of('e', 'f')
        );
    final List<Character> xs = List.of('a', 'b', 'c', 'd', 'e', 'f');
    final int n = 2;
    assertEquals(expected, combinationBfs(xs, n));
  }

}
