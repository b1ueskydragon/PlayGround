package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzlePattern___ {

  public static int[] scores = {0, 4, 16, 48, 128};

  private static final List<Integer> notTargetW = new ArrayList<>(Arrays.asList(0, 4, 8, 12));
  private static  final List<Integer> notTargetH = new ArrayList<>(Arrays.asList(0,1,2,3));

  private static void setBlocks (int [] scores, int [] blocks, int idx){
    while (idx < 16) {
      blocks[idx] = scores[new Random().nextInt(5)];

      if(flag(blocks, idx)) setBlocks(scores, blocks, idx);
      idx ++;
    }
  }

  private static boolean flag(int [] blocks, int idx) {
    boolean flag = false;
    if (!notTargetW.contains(idx)) {
      flag =
          blocks[idx] == blocks[idx - 1];
    }
    if (!notTargetH.contains(idx)) {
      flag =
          blocks[idx] == blocks[idx - 4];
    }
    if (!notTargetW.contains(idx) && !notTargetH.contains(idx)) {
      flag =
          blocks[idx] == blocks[idx - 1]
      && blocks[idx] == blocks[idx - 4];
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
      int [] blocks = new int[16];
      setBlocks(scores, blocks, 0);

      for (int e : blocks) System.out.println(e);

  }
}
