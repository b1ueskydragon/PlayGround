package daily_coding_problem.p708;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class FixedPointSpec {

  private Solution underTest = new Solution();

  @Test
  public void shouldReturnIndexIfFixedPointExists() {
    final int[] sortedNums1 = {-6, 0, 2, 4, 9, 10, 11, 40};
    assertThat(underTest.fixedPoint(sortedNums1), equalTo(2));

    final int[] sortedNums2 = {-1, 0, 1, 2, 3, 4, 5, 7};
    assertThat(underTest.fixedPoint(sortedNums2), equalTo(7));

    final int[] sortedNums3 = {0, 2, 4, 6, 8, 10, 12};
    assertThat(underTest.fixedPoint(sortedNums3), equalTo(0));
  }

  @Test
  public void shouldReturnFalseIfFixedPointNotExists() {
    final int[] sortedNums = {1, 5, 7, 8};
    assertThatThrownBy(() -> underTest.fixedPoint(sortedNums))
        .isExactlyInstanceOf(IllegalArgumentException.class);
  }

}
