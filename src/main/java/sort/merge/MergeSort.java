package sort.merge;

import java.util.Arrays;

public class MergeSort {

  /**
   * 配列を再帰的に, ソートしながらマージする
   *
   * @param ary   配列
   * @param left  左のインデックス
   * @param right 右のインデックス
   * @param buff  共有バッファ
   */
  private static void mergeSort(int[] ary, int left, int right, int[] buff) {

    if (left < right) {
      int center = (left + right) / 2;
      mergeSort(ary, left, center, buff);      // 左半分
      mergeSort(ary, center + 1, right, buff); // 右半分

      int p = 0;    // 左半分の個数
      int j = 0;    // 右半分の個数
      int k = left; // ary の走査インデックス

      int i;

      // バッファに左半分を格納
      for (i = left; i <= center; i++) {
        buff[p++] = ary[i];
      }

      // TODO 三項演算子に変更
      while (i <= right && j < p) {
        if (buff[j] <= ary[i]) {
          ary[k++] = buff[j++];
        } else {
          ary[k++] = ary[i++];
        }
      }

      // buff の残り要素を ary にコピー
      while (j < p) {
        ary[k++] = buff[j++];
      }
    }
  }

  public static void main(String[] args) {

    int[] testAry = {2, 3, 6, 5, 7, 9, 8, 1, 0, 4, 10};
    int n = testAry.length;
    int[] buff = new int[n];

    mergeSort(testAry, 0, n - 1, buff);
    Arrays.stream(testAry).forEach(System.out::println);
  }
}
