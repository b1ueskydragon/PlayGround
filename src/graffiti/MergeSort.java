package graffiti;

import java.util.Random;

/**
 * 2017/07/05.
 */
public class MergeSort {

  static int[] buff; // 作業用配列

  // 再帰的マージソーと
  static void mergeSort(int[] a, int left, int right) {

    if (left < right) {
      int i;
      int center = (left + right) / 2;
      int p = 0;
      int j = 0;
      int k = left;


      // recursion
      mergeSort(a, left, center); // 前半部
      mergeSort(a, center + 1, right); // 後半部

      for (i = left; i <= center; i++) {
        buff[p++] = a[i];
      }
      while (i <= right && j < p) {
        a[k++] = buff[j] <= a[i] ? buff[j++] : a[i++];
      }

      while (j < p) {
        a[k++] = buff[j++];
      }
    }
  }

  // 実際のマージソート

  static void doMergeSort(int[] a, int n) {

    buff = new int[n]; // 作業用配列

    mergeSort(a, 0, n - 1); // sort

    buff = null; // メモリ解放
  }


  public static void main(String[] args) {

    int nx = 10;
    int[] x = new int[nx];

    for (int i = 0; i < 10; i++) {
      Random rnd = new Random();
      int r = rnd.nextInt(10) + 1;
      x[i] = r;
    }

    for (int e : x) {
      System.out.print(e + ". ");
    }

    doMergeSort(x, nx);

    System.out.println();

    for (int e : x) {
      System.out.print(e + ". ");
    }
  }
}
