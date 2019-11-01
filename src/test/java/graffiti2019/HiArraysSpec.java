package graffiti2019;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class HiArraysSpec {

  @Test
  public void shouldProductScalarFromSameDimensionVectors() {
    final int[] tx = {1, 3, 5, 7, 9};
    final double[] x = {0.1, 0.3, 0.5, 0.7, 0.9};
    assertThat(HiArrays.productScalar(tx, x), Matchers.is(closeTo(16.5, 1e-6)));
  }


  @Test
  public void shouldGetNonZeroValues() {
    final double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    assertThat(HiArrays.nonZeroValues(), equalTo(values));
  }

}
