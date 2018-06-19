package graffiti2018.fullSearch.dfs;

// 与えられた n 個の整数 a1,...,an から部分集合をうまく選んで、その集合内の数の和が与えられた数 k に等しくなるようにできるかどうかを判定する.
public class PartialSum {

  /**
   * Using depth-first search.
   * @param i index of a0 ~ ai
   * @param k sum
   * @return
   */
  private static boolean dfs(int i, int k) {


    // 全探索したけどなかった
    return false;
  }

  public static void main(String... args) {
    System.out.println(dfs(0, 0));
  }
}
