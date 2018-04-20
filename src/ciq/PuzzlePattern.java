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
public class PuzzlePattern {

  // 全マスの合計
  private static int sumOfArray(int[][] board){
    int sum = 0;
    for (int i = 0; i < 4 ; i ++) {
      for (int j = 0 ; j < 4 ; j ++) {
        sum += board[i][j];
      }
    }
    return sum;
  }

  // マス一つに対する判定
  private static boolean condition(int[][]board, int x, int y, int el, int inputSum){

    int a = board[0][0];
    int b = board[0][1];
    int c = board[0][2];
    int d = board[0][3];
    int e = board[1][0];
    int f = board[1][1];
    int g = board[1][2];
    int h = board[1][3];
    int i = board[2][0];
    int j = board[2][1];
    int k = board[2][2];
    int l = board[2][3];
    int m = board[3][0];
    int n = board[3][1];
    int o = board[3][2];
    int p = board[3][3];


    // ゲームオーバーの条件①
    boolean falseBox =
      a != b
        && b!= c
        && c !=d
        && e != a
        && e != f
        && e != i
        && f != b
        && f != g
        && f != j
        && g != c
        && g != h
        && g != k
        && h != d
        && h != l
        && i != j
        && i !=m
        && j != k
        && j != n
        && k != l
        && k != o
        && l != p
        && m != a
        && a != o
        && o != p;


    // ゲームオーバーの条件②
    boolean falseAns =
        board[x][y] != 2048;

    // 入力した合計と実際の合計が一致
    boolean result = inputSum ==  16 * (el * ((int)(Math.log(el)/Math.log(2)) -1));

    return !falseBox && falseAns && result;
  }

  // 実際答えを求めるところ
  private static int calc(int [][] board){

    Scanner sc = new Scanner(System.in);
    int inputSum = sc.nextInt(); // 16マスの総和 (入力)
    int resultFlag = 0;

    List<Integer> elementList = new ArrayList<>(Arrays.asList(2,4,6,8,16,32));

    while (inputSum != sumOfArray(board)) {

      Random rnd = new Random();
      int idx = rnd.nextInt(5);

      int el = elementList.get(idx);

      for (int i = 0; i < 4 ; i ++) {
        for (int j = 0 ; j < 4 ; j ++) {
          board[i][j] = el;

          // とある条件を満たすと回数が上がる
          if (condition(board, i, j, el, inputSum)) {
            resultFlag += 1;
          }
        }
      }

      if(inputSum == sumOfArray(board)) break;
    }
    return resultFlag;
  }


  public static void main(String[]args) {

    System.out.println(calc(new int[4][4]));


//    int [][] board = new int[4][4];
//
//    board[0][0] = 1;
//    board[0][1] = 2;
//    board[0][2] = 3;
//    board[0][3] = 4;
//    board[1][0] = 5;
//    board[1][1] = 6;
//    board[1][2] = 7;
//    board[1][3] = 8;
//    board[2][0] = 9;
//    board[2][1] = 10;
//    board[2][2] = 11;
//    board[2][3] = 12;
//    board[3][0] = 13;
//    board[3][1] = 14;
//    board[3][2] = 15;
//    board[3][3] = 16;
//
//    for (int i = 0; i < 4 ; i ++) {
//      for (int j = 0 ; j < 4 ; j ++) {
//        System.out.print("[" + board[i][j] + "]");
//      }
//      System.out.println();
//    }
//
//    int testSum = 0;
//    for (int i = 0; i < 4 ; i ++) {
//      for (int j = 0 ; j < 4 ; j ++) {
//        testSum += board[i][j];
//      }
//    }
//    System.out.println(testSum);
  }
}
