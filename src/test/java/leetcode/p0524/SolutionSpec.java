package leetcode.p0524;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionSpec {

  private final Solution underTest = new Solution();

  @Test
  public void testIsSubSeq() {
    var entire = "aewfafwafjlwajflwajflwafj";
    var x = "ewaf";
    assertTrue(underTest.isSubSeq(entire, x));
  }

  @Test
  public void testIsNotSubSeq() {
    var entire = "aewfafwafjlwajflwajflwafj";
    var x = "awefawfwaf";
    assertFalse(underTest.isSubSeq(entire, x));
  }

}
