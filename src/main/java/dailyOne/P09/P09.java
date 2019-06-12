package dailyOne.P09;

public class P09 {

  private static int findMaxSum(int[] ary) {
    int include = ary[0]; // max sum including the previous element
    int exclude = 0; // max sum excluding the previous element
    int excludeBuff;

    for (int i = 1; i < ary.length; i++) {
      excludeBuff = (include > exclude) ? include : exclude; // current max excluding i

      include = exclude + ary[i]; // current max including i
      exclude = excludeBuff;
    }

    return (include > exclude) ? include : exclude;
  }

  public static void main(String... args) {
    int[] ary = {8, 7, 1, 5, 2, 4, 8, 7, 9, 9, 1};
    System.out.println(findMaxSum(ary));
  }
}
