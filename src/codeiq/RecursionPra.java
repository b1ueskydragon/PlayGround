package codeiq;

public class RecursionPra {

  private static int getSum(int i) {
    if(i==0) return 0;

    else i--;

    return getSum(i) + i;
  }

  public static void main(String[] args) {
    System.out.println(getSum(10)); //45
  }
}
