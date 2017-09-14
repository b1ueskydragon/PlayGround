package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PuzzlePattern__ {

  private static final List<Integer> notTargetW = new ArrayList<>(Arrays.asList(0, 4, 8, 12));
  private static  final List<Integer> notTargetH = new ArrayList<>(Arrays.asList(0,1,2,3));

  private static int getScore(){
    List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,8,16));
    int el =  elementList.get(new Random().nextInt(4));
    return el * ((int)(Math.log(el)/Math.log(2)) -1);
  }

  private static List<Integer> setBoard(List<Integer>board){
    for (int i = 0 ; i < 16 ; i++) {
      while (sameFlag(board, i)) {
        board.set(i, getScore());
      }
    }
    return board;
  }

  private static boolean sameFlag(List<Integer> list, int idx){
    boolean flag = false;
    if(!notTargetW.contains(idx)){
      if(list.get(idx - 1).equals(list.get(idx))) {
        flag = true;
      }
    }
    if (!notTargetH.contains(idx)) {
      if (list.get(idx - 4).equals(list.get(idx))) {
        flag = true;
      }
    }
    return flag;
  }

  public static void test(int sumDefalt){
    List<Integer> board = new ArrayList<>();
    // 初期状態
    for (int i = 0 ; i < 16 ; i++) {
      board.add(sumDefalt);
    }
    List<Integer> resultBoard = setBoard(board);

    for(int i : resultBoard){
      System.out.print("[" +i+ "]");
    }

    System.out.println("");
    System.out.println(resultBoard.stream().mapToInt(Integer::intValue).sum());
  }

  public static void main(String[]args) {
    test(0);
    test(4);
    test(16);
    test(48);
  }
}
