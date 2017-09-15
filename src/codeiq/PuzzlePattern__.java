package codeiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzlePattern__ {

  private static final List<Integer> notTargetW = new ArrayList<>(Arrays.asList(0, 4, 8, 12));
  private static  final List<Integer> notTargetH = new ArrayList<>(Arrays.asList(0,1,2,3));

  private int getScore(){
    List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,8,16,32));
    int el =  elementList.get(new Random().nextInt(elementList.size())); // TODO ランダムがよくない
    return el * ((int)(Math.log(el)/Math.log(2)) -1);
  }

  private static List<Integer> getScoreList(){
    List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,8,16,32));
    List<Integer> scoreList = new ArrayList<>();
    for (Integer el : elementList) {
      scoreList.add(el * ((int) (Math.log(el) / Math.log(2)) - 1));
    }
    return scoreList;
  }

  private static List<Integer> setBoard(List<Integer>board){
    for (int i = 0 ; i < 16 ; i++) {
      while (sameFlag(board, i)) {
        board.set(i, new PuzzlePattern__().getScore());
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

  public static void test(){
    List<Integer> board = new ArrayList<>();
    for (int i = 0 ; i < 16 ; i++) {
      board.add(new PuzzlePattern__().getScore());
    }

    List<Integer> resultBoard = setBoard(board);

    int sum = resultBoard.stream()
            .filter(i -> i!=0)
            .mapToInt(Integer::intValue)
            .sum();
    if (sum <= 500) {
      for (int i : resultBoard) {
        System.out.print("[" + i + "]");
      }

      System.out.println("");
      System.out.println(sum);
    }
  }

  public static int count(){
    return count();
  }

  public static void main(String[]args) {
    test();
    test();
    test();
    test();
    test();
    test();
    test();
  }
}
