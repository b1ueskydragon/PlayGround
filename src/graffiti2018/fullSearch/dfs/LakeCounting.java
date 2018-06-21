package graffiti2018.fullSearch.dfs;

import java.util.Scanner;

// count the number of lake that 8-neighbored.
public class LakeCounting {
  private static Scanner sc = new Scanner(System.in);

  // width
  private final static int N = sc.nextInt();
  // height
  private final static int M = sc.nextInt();
  // ground
  private final static char[][] ground = new char[N][M]; // TODO

  // use dfs
  private static int countLake() {
    // TODO
    return 0;
  }


  public static void main(String... args) {
    if (sc != null) sc.close();
    /*
     * e.g.
     * N = 12
     * M = 13
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
