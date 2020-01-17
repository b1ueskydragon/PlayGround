package graffiti2020;

class InsertionSort {
  static int[] sortAscInplace(final int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      final int fixedTmp = nums[i];
      int j = i;
      while (j > 0 && nums[j - 1] > fixedTmp) {
        nums[j] = nums[j - 1]; // move to the right to write back
        j--;
      }
      nums[j] = fixedTmp; // put it on the next of j-1 (== j)
    }
    return nums;
  }

  static int[] sortAscInplaceHasASentinel(final int[] nums) {
    for (int i = 2; i < nums.length; i++) {
      final int fixedTmp = nums[i];
      int j = i;
      while (nums[j - 1] > fixedTmp) {
        nums[j] = nums[j - 1];
        j--;
      }
      nums[j] = fixedTmp;
    }
    return nums;
  }
}
