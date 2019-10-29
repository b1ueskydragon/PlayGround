package graffiti2019;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class HiFastutilsSpec {

  @Test
  public void test_justGen() {

    final int[] key = {1, 3, 5, 7, 9};
    final double[] value = {0.1, 0.3, 0.5, 0.7, 0.9};

    final DoubleList underTest = HiFastutils.justGen(key, value);

    System.out.println(underTest);

    assertThat(underTest.size(), equalTo(key.length));

    // 1e-6 == 0.000001
    assertThat(underTest.getDouble(0), Matchers.is(closeTo(0.1, 1e-6)));
    assertThat(underTest.getDouble(1), Matchers.is(closeTo(0.9, 1e-6)));
    assertThat(underTest.getDouble(2), Matchers.is(closeTo(2.5, 1e-6)));
    assertThat(underTest.getDouble(3), Matchers.is(closeTo(4.9, 1e-6)));
    assertThat(underTest.getDouble(4), Matchers.is(closeTo(8.1, 1e-6)));
  }

}
