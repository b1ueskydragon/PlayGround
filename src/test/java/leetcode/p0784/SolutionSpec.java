package leetcode.p0784;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SolutionSpec {

  private final Solution underTest = new Solution();

  @Test
  public void testHasSortedAlphaAndNum() {
    final var S = "a1b2";
    final var actual = underTest.letterCasePermutation(S);
    final var backTrackingOrder = List.of("a1b2", "a1B2", "A1b2", "A1B2");
    assertThat(actual, equalTo(backTrackingOrder));
  }

}
