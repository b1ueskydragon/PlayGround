package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PuzzlePattern___ {

  public static int[] scores = {0, 4, 16, 48, 128};

  private static boolean flag(int idx) {
    boolean flag = false;
    if (idx > 0) {
      flag = idx == idx - 1;
    }
    if (idx > 4) {
      flag = idx == idx - 4;
    }
    return flag;
  }

  private static int sum(int[] scores, int idx, int goal) {

    if (idx == 0) {
      return scores[idx] + (goal - scores[idx]);

    } else if (goal < 0 || idx >= scores.length) {
      return 0;

    } else {
      return sum(scores, idx, goal) + sum(scores, idx + 1, goal);

    }
  }

  public static void main(String[] args) {

    System.out.println(sum(scores, 0, 32));

//    int count = 0; // 足した回数
//    while (count < 16) {
//
//      count++;
//    }

  }

}
