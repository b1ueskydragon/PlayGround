package ciq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 標準入力からスコアが与えられたとき、ゲームオーバーとなった状態が何通りあるかを求め、標準出力に出力してください。
 * なお、入力されるスコアは500以下の正の整数とします。
 */
public class PuzzlePattern_ {

  private static int getElement(){
    List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,8,16));
    return elementList.get(new Random().nextInt(4));
  }

  private static int getScore(int el){
    return el * ((int)(Math.log(el)/Math.log(2)) -1);
  }

  private static boolean isSame(int x, int y){
    return x == y;
  }

  private static int getSum(int[][] board) {
    int sum = 0;

    board[0][0] = getElement();
    board[0][1] = getElement();
    while(isSame(board[0][0], board[0][1])) {
      board[0][1] = getElement();
    }
    board[0][2] = getElement();
    while(isSame(board[0][1], board[0][2])) {
      board[0][2] = getElement();
    }
    board[0][3] = getElement();
    while(isSame(board[0][2], board[0][3])) {
      board[0][3] = getElement();
    }

    board[1][0] = getElement();
    board[1][1] = getElement();
    while(isSame(board[1][0], board[1][1])) {
      board[1][1] = getElement();
    }
    board[1][2] = getElement();
    while(isSame(board[1][1], board[1][2])) {
      board[1][2] = getElement();
    }
    board[1][3] = getElement();
    while(isSame(board[1][2], board[1][3])) {
      board[1][3] = getElement();
    }

    board[2][0] = getElement();
    board[2][1] = getElement();
    while(isSame(board[2][0], board[2][1])) {
      board[2][1] = getElement();
    }
    board[2][2] = getElement();
    while(isSame(board[2][1], board[2][2])) {
      board[2][2] = getElement();
    }
    board[2][3] = getElement();
    while(isSame(board[2][2], board[2][3])) {
      board[2][3] = getElement();
    }

    board[3][0] = getElement();
    board[3][1] = getElement();
    while(isSame(board[3][0], board[3][1])) {
      board[3][1] = getElement();
    }
    board[3][2] = getElement();
    while(isSame(board[3][1], board[3][2])) {
      board[3][2] = getElement();
    }
    board[3][3] = getElement();
    while(isSame(board[3][2], board[3][3])) {
      board[3][3] = getElement();
    }


    for (int i = 0; i < 4 ; i ++) {
      for (int j = 0 ; j < 4 ; j ++) {
        sum += getScore(board[i][j]);
      }
    }
    return sum;
  }

  public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);
   // int inputSum = sc.nextInt(); // 16マスの総和 (入力)

    int [][] board = new int[4][4];

    System.out.println(getSum(board));

    for (int i = 0; i < 4 ; i ++) {
      for (int j = 0 ; j < 4 ; j ++) {
        System.out.print("[" + board[i][j] + "]");
      }
      System.out.println();
    }


  }
}
