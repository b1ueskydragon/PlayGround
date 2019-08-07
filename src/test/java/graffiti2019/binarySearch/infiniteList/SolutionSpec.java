package graffiti2019.binarySearch.infiniteList;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static graffiti2019.binarySearch.infiniteList.Solution.searchInfiniteSortedArray;
import static graffiti2019.binarySearch.orderAgnostic.Solution.searchKeyIndexFromSortedArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSpec {

  @Test
  void test_searchInfiniteSortedArray() {
    var input = new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
    var reader = new ArrayReader(input);
    var key = 28;
    var expected = 12;
    assertEquals(expected, searchInfiniteSortedArray(reader, key));
  }

  @Test
  void test_not_found() {
    var input = new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
    var reader = new ArrayReader(input);
    var key = 11;
    var expected = -1;
    assertEquals(expected, searchInfiniteSortedArray(reader, key));
  }

  @Test
  void test_bigBound_bound_none_fixed() {
    var heapSizeAvailable = Runtime.getRuntime().freeMemory();
    var maxSize = (int) (heapSizeAvailable << 3) + 500000000;

    // TODO Stream.iterate
    var step = 3;
    var input = IntStream.rangeClosed(0, maxSize / step).map(i -> i * step).toArray();

    var reader = new ArrayReader(input);
    var key = 4194303;
    var expected = 1398101;
    assertEquals(expected, searchInfiniteSortedArray(reader, key));
  }

  @Test
  void test_bigBound_bound_fixed() {
    var heapSizeAvailable = Runtime.getRuntime().freeMemory();
    var maxSize = (int) (heapSizeAvailable << 3) + 500000000;

    var step = 3;
    var input = IntStream.rangeClosed(0, maxSize / step).map(i -> i * step).toArray();
    var key = 4194303;
    var expected = 1398101;
    assertEquals(expected, searchKeyIndexFromSortedArray(input, key));
  }

}
