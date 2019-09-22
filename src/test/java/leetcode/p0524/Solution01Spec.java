package leetcode.p0524;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class Solution01Spec {

  private final Solution01 underTest = new Solution01();

  @ParameterizedTest
  @MethodSource("initMatrixProvider")
  public void testInit(int row, int[] expected) {
    var s = "abcde"; // abcde is correspond to 01234

    Solution01.init(s); // side effect

    var actual = Solution01.dic;

    assertThat(actual[row], equalTo(expected));

    assertThat(actual.length, equalTo(s.length() + 1));
    assertThat(actual[0].length, equalTo('z' - 'a' + 1));
  }

  private static Iterable<Object[]> initMatrixProvider() {
    return Arrays.asList(new Object[][]{
            {0, new int[]{0, 1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}},
            {1, new int[]{-1, 1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}},
            {2, new int[]{-1, -1, 2, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}},
            {3, new int[]{-1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}},
            {4, new int[]{-1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}},
            {5, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}}
        }
    );
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
