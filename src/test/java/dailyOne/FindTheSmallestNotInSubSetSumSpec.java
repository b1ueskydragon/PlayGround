package dailyOne;

import dailyOne.p641.Solution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

class FindTheSmallestNotInSubSetSumSpec {

  final Solution underTest = new Solution();

  @Test
  void caseStartWithOne() {
    final int[] sortedArray = {1, 2, 3, 10};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(7));
  }

  @Test
  void caseNoTwo() {
    final int[] sortedArray = {1, 3, 6, 10, 11, 15};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(2));
  }

  @Test
  void caseDuplicatedAndOnlyOne() {
    final int[] sortedArray = {1, 1, 1, 1};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(5));
  }

  @Test
  void caseDuplicatedOne() {
    final int[] sortedArray = {1, 1, 3, 4};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(10));
  }

  @Test
  void caseThreeCouldBuiltWithSumButNoFour() {
    final int[] sortedArray =  {1, 2, 5, 10, 20, 40};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(4));
  }

  @Test
  void caseConsecutiveNumbersWithoutSix() {
    final int[] sortedArray =  {1, 2, 3, 4, 5, 7};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(23));
  }

  @Test
  void caseConsecutiveNumberAndLastIsBig() {
    final int[] sortedArray =  {1, 2, 3, 4, 5, 100};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(16));
  }

  @Test
  void caseNoOne() {
    final int[] sortedArray =  {101, 102, 104};
    assertThat(underTest.findTheSmallestNotInSubSetSum(sortedArray), equalTo(1));
  }
}
