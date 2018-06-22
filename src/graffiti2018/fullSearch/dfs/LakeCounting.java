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
  private static String[][] ground = new String[N][M];
  // lake counter
  private static int count = 0;

  /***
   * 1 dfs == 1 search (8-neighbored)
   *
   * @param n current position H
   * @param m current position W
   */
  private static void countLake(int n, int m) {
    ground[n][m] = "."; // mark a current position first
    // TODO
  }

  public static void main(String... args) {
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
    lake();
    // countLake(0, 0);
    System.out.println(count);
    if (sc != null) sc.close();
  }

  // TODO Turn to stdin.
  private static void lake() {
    for (int i = 0; i < ground.length; i++) {
      for (int j = 0; j < ground[N - 1].length; j++) {
        //ground[i][j] = sc.next();
        ground[i][j] = ".";
      }
    }

    ground[0][0] = "W";
    ground[0][9] = "W";
    ground[0][10] = "W";
    ground[1][1] = "W";
    ground[1][2] = "W";
    ground[1][3] = "W";
    ground[1][9] = "W";
    ground[1][10] = "W";
    ground[1][11] = "W";
    ground[2][4] = "W";
    ground[2][5] = "W";
    ground[2][9] = "W";
    ground[2][10] = "W";
    ground[3][9] = "W";
    ground[3][10] = "W";
    ground[4][9] = "W";
    ground[5][2] = "W";
    ground[5][9] = "W";
    ground[6][1] = "W";
    ground[6][3] = "W";
    ground[6][9] = "W";
    ground[6][10] = "W";
    ground[7][0] = "W";
    ground[7][2] = "W";
    ground[7][4] = "W";
    ground[7][10] = "W";
    ground[8][1] = "W";
    ground[8][3] = "W";
    ground[8][10] = "W";
    ground[9][2] = "W";
    ground[9][10] = "W";

    for (String[] ary : ground) {
      for (String c : ary) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
