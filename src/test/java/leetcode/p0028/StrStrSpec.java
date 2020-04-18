package leetcode.p0028;

import org.junit.jupiter.api.Test;

import static leetcode.p0028.Solution.skipTable;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class StrStrSpec {
  private final Solution a = new Solution();

  @Test
  public void shouldReturnTheFirstOccurrenceIndex() {
    assertThat(a.strStr("hello", "ll"), equalTo(2));
  }

  @Test
  public void shouldReturnTheFirstOccurrenceIndexWhenNeedleIsEmptyStr() {
    // java's indexOf returns 0 if the substring to search for is empty string.
    // the initial value of `fromIndex` is 0.
    assertThat(a.strStr("string", ""), equalTo(0));
  }

  @Test
  public void shouldReturnNegativeIndexIfNotFound() {
    assertThat(a.strStr("aaaaa", "bba"), equalTo(-1));
  }

  @Test
  public void shouldReturnTheFirstOccurrenceIndexRepeated() {
    assertThat(a.strStr("bacbbbbbbbbab", "bab"), equalTo(10));
  }

  @Test
  public void shouldFindSkipPatternA() {
    assertThat(skipTable("bab"), equalTo(new int[]{0, 0, 0, 1}));
  }

  @Test
  public void shouldFindSkipPatternB() {
    assertThat(skipTable("abc"), equalTo(new int[]{0, 0, 0, 0}));
  }

  @Test
  public void shouldFindSkipPatternC() {
    assertThat(skipTable("ababc"), equalTo(new int[]{0, 0, 0, 1, 2, 0}));
  }

  @Test
  public void shouldReturnIndexEventHasRepetitionA() {
    assertThat(a.strStr("mississippi", "issip"), equalTo(4));
  }

  @Test
  public void shouldFindSkipPatternD() {
    assertThat(skipTable("issip"), equalTo(new int[]{0, 0, 0, 0, 1, 0}));
  }

  @Test
  public void shouldReturnIndexEventHasRepetitionB() {
    assertThat(a.strStr("aabaaabaaac", "aabaaac"), equalTo(4));
  }

  @Test
  public void shouldFindSkipPatternE() {
    assertThat(skipTable("aabaaac"), equalTo(new int[]{0, 0, 1, 0, 1, 2, 2, 0}));
  }

  @Test
  public void testWeiredCase() {
    assertThat(skipTable("ababba"), equalTo(new int[]{0, 0, 0, 1, 2, 0, 1}));

    assertThat(skipTable("awfaawfaawfaaawfaawfaawfa" +
            "awfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfaawfaawfaawfaaawfaawfaawfa")
        , equalTo(new int[]{
            0, 0, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 10, 11, 12, 13, 10, 11, 12, 13,
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225}));
  }

}
