package leetcode.p0524;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;


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

  @Test
  public void testFindLongestWord() {
    var s = "aewfafwafjlwajflwajflwafj";
    var d = List.of("apple", "awefawfwaf", "ewaf", "awef", "aafj", "abc", "awefe", "ewafeffewafewf");

    var expected = "aafj";
    var actual = underTest.findLongestWord(s, d);
    assertThat(actual, equalTo(expected));
  }

  @Test
  public void testFindLongestWordHasOnlyTwoChars() {
    var s = "bab";
    var d = List.of("ba", "ab", "a", "b");

    var expected = "ab";
    var actual = underTest.findLongestWord(s, d);
    assertThat(actual, equalTo(expected));
  }

}
