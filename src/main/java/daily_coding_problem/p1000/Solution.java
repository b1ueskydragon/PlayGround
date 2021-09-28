package daily_coding_problem.p1000;

class Solution {
  // An array of length n sorted in ascending order is rotated between 1 and n times.
  // All the integers of nums are unique.
  // O(log n) time.
  public int findMin(int[] nums) {
    int l = 0, r = nums.length - 1;

    while (l < r) {
      // if the distance is 2, left-side will be selected
      int p = l + (r - l) / 2;

      if (nums[l] < nums[r]) {
        return nums[l];
      }

      // nums[l] > nums[r]

      if (nums[l] < nums[p]) {
        l = p;
        continue;
      }
      if (nums[l] > nums[p]) {
        r = p;
        continue;
      }

      return nums[r];
    }

    return nums[l];
  }
}
