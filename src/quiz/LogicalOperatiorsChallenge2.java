package quiz;

public class LogicalOperatiorsChallenge2 {

  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 5;

    if (num1 > num2 & num1++ > num2) {
      num1++;
    }

    if (++num2 > num1 || num1++ == num2++) {
      num1++;
    }

    System.out.println(num1 + ":" + num2);
  }
}
