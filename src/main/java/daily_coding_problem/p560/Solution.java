package daily_coding_problem.p560;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  // return values
  public int[] twoSumValue(int[] nums, int k) {
    Map<Integer, Integer> kPair = new HashMap<>(); // int[] instead of HashMap is OK. if we know the limit of number.
    for (int num : nums) {
      if (kPair.containsKey(k - num)) {
        return new int[]{num, k - num};
      }
      kPair.put(num, k - num);
    }
    return new int[]{-1, -1};
  }

  // return indices
  public int[] twoSumIndex(int[] nums, int target) {
    final Map<Integer, Integer> targetPair = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final int num = nums[i];
      if (targetPair.containsKey(target - num)) {
        return new int[]{i, targetPair.get(target - num)};
      }
      targetPair.put(num, i);
    }
    return new int[]{-1, -1};
  }
}
