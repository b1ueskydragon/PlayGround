package leetcode.p0090;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSpec {

  private Solution underTest = new Solution();

  @Test
  void test_subsetsWithDup_sort_and_dfs() {
    int[] nums = {2, 1, 2};
    List<List<Integer>> expected = new ArrayList<>() {{
      add(new ArrayList<>());
      add(new ArrayList<>() {{
        add(1);
      }});
      add(new ArrayList<>() {{
        add(1);
        add(2);
      }});
      add(new ArrayList<>() {{
        add(1);
        add(2);
        add(2);
      }});
      add(new ArrayList<>() {{
        add(2);
      }});
      add(new ArrayList<>() {{
        add(2);
        add(2);
      }});
    }};
    assertEquals(expected, underTest.subsetsWithDup(nums));
  }

  @Test
  void test_subsetsWithDup_all_duplicated() {
    int[] nums = {1, 1, 2, 2};
    var expected = List.of(
        List.of(),
        List.of(1),
        List.of(1, 1),
        List.of(1, 1, 2),
        List.of(1, 1, 2, 2),
        List.of(1, 2),
        List.of(1, 2, 2),
        List.of(2),
        List.of(2, 2));
    assertEquals(expected, underTest.subsetsWithDup(nums));
  }

}
