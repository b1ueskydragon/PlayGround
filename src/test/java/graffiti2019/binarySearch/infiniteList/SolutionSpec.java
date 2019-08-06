package graffiti2019.binarySearch.infiniteList;

import org.junit.jupiter.api.Test;

import static graffiti2019.binarySearch.infiniteList.Solution.searchInfiniteSortedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionSpec {

  @Test
  void test_searchInfiniteSortedArray() {
    var input = new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
    var reader = new ArrayReader(input);
    var key = 16;
    var expected = 6;
    assertEquals(expected, searchInfiniteSortedArray(reader, key));
  }
}
