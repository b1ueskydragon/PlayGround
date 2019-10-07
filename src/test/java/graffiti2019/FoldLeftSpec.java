package graffiti2019;

import org.junit.Test;

import java.util.List;
import java.util.function.BiFunction;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FoldLeftSpec {

  @Test
  public void testBasicFold() {
    final List<String> seq = List.of("2", "3", "5", "7", "11", "13");
    final int expected = seq.stream().mapToInt(Integer::parseInt).sum();

    final BiFunction<Integer, String, Integer> bf = (acc, x) -> acc += Integer.parseInt(x);

    final int actualA = FoldLeft.BasicRecursion.foldLeft(seq, 0, bf);
    final int actualB = FoldLeft.BasicLoop.foldLeft(seq, 0, bf);

    assertThat(actualA, equalTo(expected));
    assertThat(actualB, equalTo(expected));
  }

}
