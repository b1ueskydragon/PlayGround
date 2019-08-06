package graffiti2019.binarySearch.orderAgnostic;

class Solution {

  /**
   * Order-Agnostic Binary Search
   *
   * @param arr array sorted in ascending or descending order
   * @param key to find. key is present in the array
   * @return index of the key if it is present. otherwise -1
   */
  static int searchKeyIndexFromSortedArray(int[] arr, int key) {
    int start = 0, end = arr.length - 1;

    // ascending order only
    while (start <= end) {
      // adding may cause integer overflow in JVM
      // int middle = (start + end) / 2;
      int middle = (end - start) / 2 + start;

      if (key == arr[middle]) return middle;

      if (key < arr[middle]) end = middle - 1;
      else start = middle + 1;
    }

    return -1;
  }

}
