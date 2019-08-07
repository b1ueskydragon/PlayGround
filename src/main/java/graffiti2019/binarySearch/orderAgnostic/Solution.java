package graffiti2019.binarySearch.orderAgnostic;

public class Solution {

  /**
   * Order-Agnostic Binary Search
   *
   * @param arr array sorted in ascending or descending order
   * @param key to find. key is present in the array
   * @return index of the key if it is present. otherwise -1
   */
  public static int searchKeyIndexFromSortedArray(int[] arr, int key) {
    int start = 0, end = arr.length - 1;
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      // adding may cause integer overflow in JVM
      // int middle = (start + end) / 2;
      int middle = (end - start) / 2 + start;
      if (key == arr[middle]) return middle;

      if (isAsc) {
        if (key < arr[middle]) end = middle - 1;
        else start = middle + 1;
      } else {
        if (key > arr[middle]) end = middle - 1;
        else start = middle + 1;
      }

    }

    return -1;
  }

}
