package leetcode.p0055;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameSpec {

  @Test
  void canTrackFromGoalToStart() {
    {
      final int[] nums = {2, 3, 1, 1, 4};
      final var underTest = new Solution();
      assertTrue(underTest.canJump(nums));
    }
    {
      final int[] nums = {3, 5, 1, 0, 4};
      final var underTest = new Solution();
      assertTrue(underTest.canJump(nums));
    }
    {
      final int[] nums = {1, 1, 2, 2, 0, 1, 1};
      final var underTest = new Solution();
      assertTrue(underTest.canJump(nums));
    }
    {
      final int[] nums = {0};
      final var underTest = new Solution();
      assertTrue(underTest.canJump(nums));
    }
    {
      final int[] nums = {3, 2, 1, 0, 4};
      final var underTest = new Solution();
      assertFalse(underTest.canJump(nums));
    }
  }

}
