package graffiti;

import java.util.Random;

public class Cat {
  public static void main(String[] args) {
    String[] cats = {"なる", "とき"};

    for (int i = 0; i < 10; i++) {
      System.out.println(cats[new Random().nextInt(2)]);
    }
  }
}

