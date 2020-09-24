package leetcode.p0362;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class HitCounterSpec {

  @Test
  public void test1to4() {
    HitCounter counter = new HitCounter();

    counter.hit(1);
    counter.hit(2);
    counter.hit(3);

    assertThat(counter.getHits(4), equalTo(3));
  }

  @Test
  public void test1to300() {
    HitCounter counter = new HitCounter();

    counter.hit(1);
    counter.hit(2);
    counter.hit(3);
    counter.hit(300);

    assertThat(counter.getHits(300), equalTo(4));
  }

  @Test
  public void test2to301() {
    HitCounter counter = new HitCounter();

    counter.hit(1);
    counter.hit(2);
    counter.hit(3);
    counter.hit(300);

    assertThat(counter.getHits(301), equalTo(3));
  }

  @Test
  public void testInvokeManyTimes() {
    HitCounter counter = new HitCounter();

    counter.hit(1);
    counter.hit(2);
    counter.hit(3);

    assertThat(counter.getHits(4), equalTo(3));

    counter.hit(300);

    assertThat(counter.getHits(300), equalTo(4));
    assertThat(counter.getHits(301), equalTo(3));
  }
}
