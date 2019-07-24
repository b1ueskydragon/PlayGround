package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static graffiti2019.SubSet.generateWithBitwise;
import static graffiti2019.SubSet.generateWithDq;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubSetSpec {

  @Test
  void test_generate_BFS_deque() {
    var res = List.of(
        List.of(),
        List.of('a'),
        List.of('b'),
        List.of('a', 'b'),
        List.of('c'),
        List.of('a', 'c'),
        List.of('b', 'c'),
        List.of('a', 'b', 'c')
    );

    var expected = new HashSet<>(res);
    assertEquals(res.size(), expected.size());

    var actual = new HashSet<>(generateWithDq(List.of('a', 'b', 'c')));
    assertEquals(expected, actual);
  }


  @Test
  void test_generate_BFS_bit_op() {
    var res = List.of(
        List.of(),
        List.of('a'),
        List.of('b'),
        List.of('a', 'b'),
        List.of('c'),
        List.of('a', 'c'),
        List.of('b', 'c'),
        List.of('a', 'b', 'c')
    );

    var expected = new HashSet<>(res);
    assertEquals(res.size(), expected.size());

    var actual = new HashSet<>(generateWithBitwise(List.of('a', 'b', 'c')));
    assertEquals(expected, actual);
  }

}
