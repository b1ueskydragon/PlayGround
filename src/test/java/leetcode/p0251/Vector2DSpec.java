package leetcode.p0251;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector2DSpec {

  @Test
  void testSample1() {
    final List<List<Integer>> vec2d = List.of(List.of(1, 2), List.of(3), List.of(), List.of(4, 5, 6));
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add); // invokes hasNext() and operate action to each element.
    assertEquals(List.of(1, 2, 3, 4, 5, 6), actual);
  }

  @Test
  void testSample1Realign() {
    final List<List<Integer>> vec2d = List.of(List.of(1), List.of(2), List.of(3, 4, 5), List.of(6));
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add);
    assertEquals(List.of(1, 2, 3, 4, 5, 6), actual);
  }

  @Test
  void testSample2() {
    final List<List<Integer>> vec2d = List.of(List.of(7, 9), List.of(5));
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add);
    assertEquals(List.of(7, 9, 5), actual);
  }

  @Test
  void testHasEmptyRows() {
    final List<List<Integer>> vec2d = List.of(List.of(), List.of(7, 9), List.of(), List.of(5), List.of(), List.of(), List.of());
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add);
    assertEquals(List.of(7, 9, 5), actual);
  }

  @Test
  void testOnlyHasEmptyRows() {
    final List<List<Integer>> vec2d = List.of(List.of(), List.of(), List.of(), List.of(), List.of());
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add);
    assertEquals(List.of(), actual);
  }

  @Test
  void testCouldIgnoreDuplicatedNext() {
    final List<List<Integer>> vec2d = List.of(List.of(1, 2), List.of(3), List.of(), List.of(4, 5, 6));
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    while (underTest.hasNext()) {
      underTest.hasNext();
      underTest.hasNext();
      underTest.hasNext();
      underTest.hasNext();
      actual.add(underTest.next());
    }
    assertEquals(List.of(1, 2, 3, 4, 5, 6), actual);
  }

  @Test
  void testCouldGetNextWithoutHasNext() {
    final List<List<Integer>> vec2d = List.of(List.of(1, 2), List.of(3), List.of(), List.of(4, 5, 6));
    final Vector2D underTest = new Vector2D(vec2d);
    assertEquals(1, underTest.next());
    assertEquals(2, underTest.next());
    final List<Integer> rem = new ArrayList<>();
    underTest.forEachRemaining(rem::add);
    assertEquals(List.of(3, 4, 5, 6), rem);
  }

  @Test
  void testCouldThrowProperExceptionWhenReachedToEnd() {
    final List<List<Integer>> vec2d = List.of(List.of(1, 2), List.of(3), List.of(), List.of(4, 5, 6));
    final Vector2D underTest = new Vector2D(vec2d);
    final List<Integer> actual = new ArrayList<>();
    underTest.forEachRemaining(actual::add);
    assertEquals(List.of(1, 2, 3, 4, 5, 6), actual);
    assertThrows(IndexOutOfBoundsException.class, underTest::next); // here throws.
  }

}
