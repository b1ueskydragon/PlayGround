package dailyOne.p900;

class Solution {
  public int maxSubArray(int[] nums) {
    int sumSoFar = 0;
    int cand = nums[0];

    for (int num : nums) {
      sumSoFar += num;
      // reset the start point if current number is larger than sum so far
      sumSoFar = Math.max(sumSoFar, num);
      // determine that refresh cached candidate or not
      cand = Math.max(cand, sumSoFar);
    }

    return cand;
  }
}
