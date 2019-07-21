package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubSetSpec {

  @Test
  void test_3length_CharList() {
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
    var actual = SubSet.generate(List.of('a', 'b', 'c'));
    assertEquals(expected, actual);
  }

}
