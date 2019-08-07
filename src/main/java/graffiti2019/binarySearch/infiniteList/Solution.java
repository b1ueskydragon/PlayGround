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

public class Solution {

  public static int searchInfiniteSortedArray(ArrayReader reader, int key) {
    // find a proper bound first
    int start = 0, end = 1;

    while (reader.get(end) < key) {
      var bound = end - start + 1;
      start = end + 1;
      end += bound * 2; // increase to double
    }

    return binarySearch(reader, key, start, end);
  }

  private static int binarySearch(ArrayReader reader, int key, int start, int end) {
    while (start <= end) {
      int middle = start + (end - start) / 2;
      var midVal = reader.get(middle);

      if (key == midVal) return middle;

      if (key < midVal) end = middle - 1;
      else start = middle + 1;
    }

    return -1;
  }

}
