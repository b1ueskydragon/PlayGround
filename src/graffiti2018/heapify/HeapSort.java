package graffiti2018.heapify;

import java.util.Arrays;

public class HeapSort {

  /**
   * O(N logN) time,
   * in-placed space,
   * non-recursive,
   * using comparison,
   * unstable
   *
   * @param ary an array before heapify
   */
  private static void heapSort(int[] ary) {

    buildMaxHeap(ary);
    int last = ary.length - 1;  // init position of a cursor (an index)

    while (last > 0) { // continue until only one element left in a reduced range
      swap(ary, 0, last);
      heapify(ary, 0, last--); // last -= 1 after heapify
    }
  }

  /**
   * O(N) time
   *
   * @param ary an array before heapify
   */
  private static void buildMaxHeap(int[] ary) {
    int i = ary.length / 2 - 1; // init position of a cursor (an index)
    while (i >= 0) heapify(ary, i--, ary.length); // i -= 1 after heapify
  }

  /**
   * ShiftDown.
   * O(logN) time with N-1 calls
   *
   * @param heap an array
   * @param curr a index of a current position
   * @param max  a maximum index of heap array
   */
  private static void heapify(int[] heap, int curr, int max) {
    int root, leftChild, rightChild; // indices

    while (curr < max) {
      root = curr;

      leftChild = 2 * curr + 1;
      rightChild = leftChild + 1;

      if (leftChild < max && heap[leftChild] > heap[root]) root = leftChild;
      if (rightChild < max && heap[rightChild] > heap[root]) root = rightChild;
      if (root == curr) return;

      swap(heap, curr, root);
      curr = root;
    }
  }

  /**
   * swap two values in array
   *
   * @param ary an array
   * @param i1  index1
   * @param i2  index2
   */
  private static void swap(int[] ary, int i1, int i2) {
    int tmp = ary[i1];
    ary[i1] = ary[i2];
    ary[i2] = tmp;
  }


  public static void main(String... args) {
    int[] ary = {8, 11, 9, 2, 10, 16};
    heapSort(ary);
    System.out.println(Arrays.toString(ary));
  }
}
