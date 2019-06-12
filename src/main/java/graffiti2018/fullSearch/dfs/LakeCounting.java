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

  private static void makeLake() {
    for (int i = 0; i < ground.length; i++) {
      for (int j = 0; j < ground[N - 1].length; j++) {
        // TODO Turn to stdin.
        //ground[i][j] = sc.next();
        ground[i][j] = "";
      }
    }

    // TODO Remove after turning to stdin.
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

  /***
   * 1 dfs == 1 search (8-neighbored)
   *
   * @param x current position H
   * @param y current position W
   */
  private static void dfs(int x, int y) {
    ground[x][y] = ""; // mark a current position first
    for (int dx = -1; dx <= 1; dx++) {
      for (int dy = -1; dy <= 1; dy++) {
        // new position of each x and y
        int nx = x + dx;
        int ny = y + dy;

        // does both of new x and y in a range ?
        if (0 <= nx && nx < N
            && 0 <= ny && ny < M) {

          // is it a pond ?
          if (ground[nx][ny].equals("W")) {
            dfs(nx, ny);
          }
        }
      }
    }
  }

  private static int countLake() {
    int count = 0;
    for (int x = 0; x < N; x++) {
      for (int y = 0; y < M; y++) {
        if (ground[x][y].equals("W")) {
          dfs(x, y);
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String... args) {
    /*
     * e.g.
     * N = 10
     * M = 12
     * ground (`W` is a pond)
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
    makeLake();
    if (sc != null) sc.close();
    System.out.println(countLake());
  }
}
