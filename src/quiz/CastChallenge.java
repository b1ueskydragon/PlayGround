package quiz;

public class CastChallenge {

  public static void main(String[] args) {

    int number1 = (int) (float) 2.0;
    double number2 = (Double) (Object) 2.0;
    float number3 = (Float) 2f;

    char number4 = 2;
    long number5 = (Long) (long) (float) 2d;

    System.out.println(number1 + number2 + number3 + number4 + number5);

  }
}
