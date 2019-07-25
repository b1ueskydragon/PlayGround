package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.List;

import static graffiti2019.SubSet.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubSetSpec {

  @Test
  void test_generate_BFS_deque() {
    var expected = List.of(
        List.of('a', 'b', 'c'),
        List.of('a', 'b'),
        List.of('a', 'c'),
        List.of('a'),
        List.of('b', 'c'),
        List.of('b'),
        List.of('c'),
        List.of()
    );
    var actual = generateWithDq(List.of('a', 'b', 'c'));
    assertEquals(expected, actual);
  }

  @Test
  void test_generate_BFS_bit_op() {
    var expected = List.of(
        List.of(),
        List.of('a'),
        List.of('b'),
        List.of('a', 'b'),
        List.of('c'),
        List.of('a', 'c'),
        List.of('b', 'c'),
        List.of('a', 'b', 'c')
    );
    var actual = generateWithBitwise(List.of('a', 'b', 'c'));
    assertEquals(expected, actual);
  }

  @Test
  void test_generate_recursion() {
    var expected = List.of(
        List.of('a', 'b', 'c'),
        List.of('a', 'b'),
        List.of('a', 'c'),
        List.of('a'),
        List.of('b', 'c'),
        List.of('b'),
        List.of('c'),
        List.of()
    );
    var actual = generateWithDfs(List.of('a', 'b', 'c'));
    assertEquals(expected, actual);
  }

}
