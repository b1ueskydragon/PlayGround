package graffiti2018.fullSearch.dfs;

import java.util.Scanner;

// count the number of lake that 8-neighbored.
public class LakeCounting {
  private static Scanner sc = new Scanner(System.in);

  // height
  private final static int N = sc.nextInt();
  // width
  private final static int M = sc.nextInt();
  // ground
  private final static char[][] ground = new char[N][M];

  // use dfs
  private static int countLake() {
    // TODO
    return 0;
  }


  public static void main(String... args) {
    if (sc != null) sc.close();

    // test before
    for (char[] ary : ground) {
      for (char n : ary) {
        System.out.print(n);
      }
      System.out.println();
    }
    /*
     * e.g.
     * N = 10
     * M = 12
     * ground
     * W........WW.
     * .WWW.....WWW
     * ....WW...WW.
     * .........WW.
     * .........W..
     * ..W......W..
     * .W.W.....WW.
     * W.W.W.....W.
     * .W.W......W.
     * ..W.......W.
     */
    System.out.println(countLake());
  }
}
