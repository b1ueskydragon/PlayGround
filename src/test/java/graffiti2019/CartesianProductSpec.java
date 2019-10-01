package graffiti2019;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CartesianProductSpec {

  @Test
  public void testAllHasSameResult() {
    final var xs = List.of('x', 'y', 'z');
    final var ys = List.of('A', 'B');
    final var commonExpectation = List.of(
        List.of('x', 'A'), List.of('x', 'B'),
        List.of('y', 'A'), List.of('y', 'B'),
        List.of('z', 'A'), List.of('z', 'B')
    );

    assertThat(CartesianProduct.Basic.product2(xs, ys), equalTo(commonExpectation));
    assertThat(CartesianProduct.ForEach.product2(xs, ys), equalTo(commonExpectation));
    assertThat(CartesianProduct.Functional.product2(xs, ys), equalTo(commonExpectation));
  }

}
