package graffiti2019.binarySearch.infiniteList;

class ArrayReader {
  private int[] arr;

  ArrayReader(int[] arr) {
    this.arr = arr;
  }

  public int get(int index) {
    return index < arr.length ? arr[index] : Integer.MAX_VALUE;
  }

}

class Solution {

  private static int searchBound() {
    return -1;
  }

  static int searchInfiniteSortedArray(ArrayReader reader, int key) {

    return -1;
  }

}
