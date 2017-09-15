package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzlePattern___ {

  // 規則に従って次のマスを埋める
  private static void setBlocks(int[] scores, int[] blocks, int idx) {
    blocks[idx] = scores[new Random().nextInt(scores.length)];

    if (flag(blocks, idx)) {
      setBlocks(scores, blocks, idx);
    }
  }

  // ただのフラグ
  private static boolean flag(int[] blocks, int idx) {
    List<Integer> up = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15));
    List<Integer> left = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15));

    boolean flag = false;
    // 上
    if (up.contains(idx)) {
      flag = blocks[idx] == blocks[idx - 4];
    }
    // 左
    if (left.contains(idx)) {
      flag = blocks[idx] == blocks[idx - 1];
    }
    return flag;
  }

  // goal の合計を満たす条件をカウントする
  private static int sum(int[] scores, int[] blocks, int idx, int goal) {
    if (goal == 0) {
      return 1;
    } else if (goal < 0 || idx >= blocks.length) {
      return 0; // 不正な条件なのでゼロ count
    } else {
      return sum(scores, blocks, idx, goal - blocks[idx]) + sum(scores, blocks, idx + 1, goal);
    }
  }

  public static void main(String[] args) {
    // 16個のマスを生成
    int[] blocks = new int[16];
    // マスになれる子たち
    //int[] scores = {0, 4, 16, 48, 128};
    int[] scores = {0, 4};

    System.out.println(sum(scores, blocks, 0, 32));


//    int idx = 0;
//    while(idx < 16){
//      setBlocks(scores,blocks,idx);
//      idx++;
//    }
//      // とりあえず出してみよう
//      int i = 0;
//      for (int e : blocks) {
//        System.out.println("[" + i + "]" + e);
//        i ++;
//      }
  }
}
