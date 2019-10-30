package graffiti2019;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class HiFastutilsSpec {

  @Test
  public void shouldProductScalarFromSameDimensionVectors() {
    final int[] tx = {1, 3, 5, 7, 9};
    final double[] x = {0.1, 0.3, 0.5, 0.7, 0.9};
    assertThat(HiFastutils.productScalar(tx, x), Matchers.is(closeTo(16.5, 1e-6)));
  }
}
