package leetcode.p0028;

import org.junit.jupiter.api.Test;

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
}
