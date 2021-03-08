package leetcode.p1064;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FixedPointSpec {

  private Solution underTest = new Solution();

  @Test
  public void case1() {
    int[] array = {-10, -5, 0, 3, 7};
    Assertions.assertEquals(3, underTest.fixedPoint(array));
  }

  @Test
  public void case2() {
    int[] array = {0, 2, 5, 8, 17};
    Assertions.assertEquals(0, underTest.fixedPoint(array));
  }

  @Test
  public void case3() {
    int[] array = {-10, -5, 3, 4, 7, 9};
    Assertions.assertEquals(-1, underTest.fixedPoint(array));
  }

}
