package leetcode.p0009;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionSpec {

  private final Solution underTest = new Solution();

  @Test
  public void testIfIsNegative() {
    final int x = -121;
    assertFalse(underTest.isPalindrome(x));
  }

  @Test
  public void testIsNotPalindrome() {
    final int x = 123;
    assertFalse(underTest.isPalindrome(x));
  }

  @Test
  public void testIsPalindromeOddLength() {
    final int x = 121;
    assertTrue(underTest.isPalindrome(x));
  }


  @Test
  public void testIsPalindromeEvenLength() {
    final int x = 1221;
    assertTrue(underTest.isPalindrome(x));
  }

}
