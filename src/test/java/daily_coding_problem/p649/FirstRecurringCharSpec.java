package daily_coding_problem.p649;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FirstRecurringCharSpec {

  private Solution underTest = new Solution();

  @Test
  public void shouldFindFirstRecurringCharacter() {
    assertThat(underTest.firstRecurringChar("acbbac"), equalTo('b'));
    assertThat(underTest.firstRecurringChar("geeksforgeeks"), equalTo('e'));
    assertThat(underTest.firstRecurringChar("hello geeks"), equalTo('l'));
  }

  @Test
  public void shouldReturnNullIfRecurringCharacterNotExists() {
    assertThat(underTest.firstRecurringChar("abcdef"), equalTo(null));
    assertThat(underTest.firstRecurringChar("ababa"), equalTo(null)); // should be repeated.
  }

}
