package graffiti2019;

import java.util.Arrays;

class OneToHundred {

  private int num = 0;

  public static int count;

  OneToHundred() {
    count++;
    num = count;
    System.out.println(num);
  }

  public static void main(String[] args) {
    // initialized outside of the scope.
    count = 0;

    // OneToHundred[] obj = new OneToHundred[100];
    new OneToHundred();
    new OneToHundred();
    new OneToHundred();
    new OneToHundred();
  }

}
