package sort.quick;

import java.util.Arrays;

public class QuickSortWithStack {

  /**
   * Non recursion QuickSort, using stack.
   *
   * @param ary   array (origin)
   * @param left  分割する区間の先頭要素の idx
   * @param right 分割する区間の末尾要素の idx
   */
  private static void quickSort(int ary[], int left, int right) {
    int capacity = right - left + 1;
    IntStack leftStack = new IntStack(capacity);
    IntStack rightStack = new IntStack(capacity);

    leftStack.push(left);
    rightStack.push(right);

    // 分割する範囲の left と right idx を pop
    while (!leftStack.isEmpty()) {
      int cl = left = leftStack.pop();
      int cr = right = rightStack.pop();

      // center value
      int center = ary[(left + right) / 2];

      while (cl <= cr) {
        while (ary[cl] < center) cl++;
        while (ary[cr] > center) cr--;
        if (cl <= cr) {
          swap(ary, cl++, cr--);
        }
      }

      if (left < cr) {
        leftStack.push(left);
        rightStack.push(cr);
      }

      if (cl < right) {
        leftStack.push(cl);
        rightStack.push(right);
      }
    }
    System.out.println(leftStack.capacity());
    System.out.println(rightStack.capacity());
  }

  private static void swap(int ary[], int inxA, int inxB) {
    int box = ary[inxA];
    ary[inxA] = ary[inxB];
    ary[inxB] = box;
  }


  public static void main(String... args) {
    int ary[] = {5, 8, 4, 2, 6, 1, 3, 9, 7};
    quickSort(ary, 0, ary.length - 1);

    Arrays.stream(ary).forEach(System.out::println);
  }
}
