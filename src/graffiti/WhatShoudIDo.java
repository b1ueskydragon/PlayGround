package graffiti;

import java.util.Random;

public class WhatShoudIDo {
  private static final String[] toDoList = {"部活に行く", "資格勉強", "ソート", "ジムへ行く", "どろぶね"};

  public static void main(String[] args) {
    Random rnd = new Random();
    int idx = rnd.nextInt(toDoList.length);
    System.out.print(toDoList[idx]);
  }
}
