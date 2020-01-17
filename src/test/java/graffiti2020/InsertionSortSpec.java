package graffiti2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class InsertionSortSpec {
  @Test
  void testDebug() {
    final int[] xs = {5, 4, 1, 2, 3};
    final int[] expected = xs.clone();
    Arrays.sort(expected);
    assertThat(InsertionSort.sortAscInplace(xs), equalTo(expected));
  }

  @Test
  void testInsertionSort() {
    final int[] xs = {11, 3, 6, 4, 4, 12, 1, 2, 3};
    final int[] expected = xs.clone();
    Arrays.sort(expected);
    assertThat(InsertionSort.sortAscInplace(xs), equalTo(expected));
  }

  @Test
  void testInsertionSortHasASentinel() {
    final int[] xs = {Integer.MIN_VALUE, 11, 3, 6, 4, 4, 12, 1, 2, 3};
    final int[] expected = xs.clone();
    Arrays.sort(expected);
    assertThat(InsertionSort.sortAscInplaceHasASentinel(xs), equalTo(expected));
  }
}
