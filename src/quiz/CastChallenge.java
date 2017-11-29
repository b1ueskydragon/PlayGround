package quiz;

public class CastChallenge {

  public static void main(String[] args) {

    int number1 = (int) (float) 2.0; // 2
    double number2 = (Double) (Object) 2.0; // 2.0
    float number3 = (Float) 2f; // 2.0
    char number4 = 2; // 2
    long number5 = (Long) (long) (float) 2d; // 2

    // type char samples
    char number4a = '2';
    System.out.println(number4a); // 2
    System.out.println((int) number4a); // 50
    System.out.println((char) 50); // 2

    System.out.println(number1 + number2 + number3 + number4 + number5); // 10.0

    // sum of double and int ...
    System.out.println(1.0 + 1); // 1.0

    int a = 10;
    char ch = 'h';
    int sum = a + ch;
    //System.out.println((int)ch);
    System.out.println(sum);

    int y = 3;
    double z = y + 4.0;
    System.out.println(z);
  }
}
