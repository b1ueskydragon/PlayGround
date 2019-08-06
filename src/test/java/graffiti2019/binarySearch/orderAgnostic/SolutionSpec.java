package graffiti2019.binarySearch.orderAgnostic;

import org.junit.jupiter.api.Test;

import static graffiti2019.binarySearch.orderAgnostic.Solution.searchKeyIndexFromSortedArray;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionSpec {

  @Test
  void test_given_is_sorted_asc() {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int key = 5;
    int expected = 4;
    assertEquals(expected, searchKeyIndexFromSortedArray(arr, key));
  }

  @Test
  void test_given_is_sorted_desc() {
    int[] arr = new int[]{0, 6, 4};
    int key = 10;
    int expected = 0;
    assertEquals(expected, searchKeyIndexFromSortedArray(arr, key));
  }

}
