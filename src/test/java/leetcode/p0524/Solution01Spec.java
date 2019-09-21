package leetcode.p0524;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class Solution01Spec {

  private final Solution01 underTest = new Solution01();

  @Test
  public void testInit() {
    var s = "abcde"; // abcde is correspond to 01234
    underTest.init(s); // side effect

    int[][] expected = {
        {0, 1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, 1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
    };

    int[][] actual = underTest.dic; // matrix

    assertThat(actual.length, equalTo(s.length() + 1));
    Arrays.stream(expected).forEach(row -> assertThat(row.length, equalTo(26)));
    IntStream.range(0, s.length()).forEach(i -> assertThat(actual[i], equalTo(expected[i])));
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
