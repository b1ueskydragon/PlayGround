package daily_coding_problem.P305;

public class RmSumZero {

  private static void solve(int[] ary) {
    int start = 0; // idx

    while (start < ary.length) {
      int curr = start; // idx
      boolean skip = false;
      int acc = 0;

      // start pos is current head
      while (curr < ary.length) {
        acc += ary[curr];
        if (acc == 0) {
          start = curr; // restart position
          skip = true;
          break;
        }
        curr += 1;
      }

      if (!skip) System.out.println(ary[start]);
      start += 1;
    }
  }

  public static void main(String... args) {
    int[] ary = {1, 2, 3, 4, -3, -1};
    solve(ary);
  }
}
