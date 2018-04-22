package sort.heap;

import java.util.Arrays;

public class HeapSort {
  /**
   * ary[left, right) をヒープ化
   * ary[left] 以外はヒープ化されている前提で,
   * ary[left] を下流の適切な位置へ下ろしていく
   *
   * @param ary   origin
   * @param left  配列の区間の先頭の idx
   * @param right 配列の区間の末尾の idx
   */
  private static void downHeap(int[] ary, int left, int right) {
    int temp = ary[left]; // 親の ary[left] がどちらの子よりも小さくないと仮定する
    int child; // idx of bigger one left vs right
    int parent; // idx of parent of child

    for (parent = left; parent < (right + 1) / 2; parent = child) {
      int cl = parent * 2 + 1; // left child
      int cr = cl + 1; // right child
      child = (cr <= right && ary[cr] > ary[cl]) ? cr : cl;
      if (temp >= ary[child]) break;
      ary[parent] = ary[child];
    }
    ary[parent] = temp;
  }

  /**
   * ary[idx, max) を再帰的にヒープ化.
   * 親, 左子, 右子 三つの要素を繰り返して比較・交換していく.
   *
   * @param ary current origin
   * @param idx current parent's idx
   * @param max excluded right idx of current interval
   */
  private static void heapify(int ary[], int idx, int max) {
    int largest = idx; // 親の idx (根が子どもたちより小さくないと仮定する)
    int left = 2 * idx + 1;
    int right = 2 * idx + 2;

    if (left < max && ary[left] > ary[idx]) { // left child is bigger than parent
      largest = left;
    }
    if (right < max && ary[right] > ary[largest]) { // right child is bigger than left child and parent
      largest = right;
    }
    if (largest != idx) { // 三つの要素のうち largest がそのまま親の場合は何もしない
      swap(ary, idx, largest);
      heapify(ary, largest, max);
    }
  }

  private static void swap(int ary[], int inxA, int inxB) {
    int box = ary[inxA];
    ary[inxA] = ary[inxB];
    ary[inxB] = box;
  }

  public static void main(String... args) {
    int[] ary = {8, 11, 9, 2, 10, 16};
    for (int i = ary.length / 2 - 1; i >= 0; i--) {
      downHeap(ary, i, ary.length - 1);
    }
    Arrays.stream(ary).forEach(System.out::println);

    System.out.println();

    int[] aryAnother = {8, 11, 9, 2, 10, 16};
    for (int i = aryAnother.length / 2 - 1; i >= 0; i--) {
      heapify(aryAnother, i, aryAnother.length);
    }
    Arrays.stream(aryAnother).forEach(System.out::println);

  }
}
