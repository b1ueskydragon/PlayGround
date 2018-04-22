package sort.heap;

import java.util.Arrays;

public class HeapSort {

  private static void swap(int ary[], int inxA, int inxB) {
    int box = ary[inxA];
    ary[inxA] = ary[inxB];
    ary[inxB] = box;
  }

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

  public static void main(String... args) {
    int[] ary = {8, 11, 9, 2, 10, 16};

    for (int i = ary.length / 2 - 1; i >= 0; i--) {
      downHeap(ary, i, ary.length - 1);
    }

    Arrays.stream(ary).forEach(System.out::println);
  }
}
