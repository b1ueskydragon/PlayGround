package quiz;

public class CastingChallenge1 {

  public static void main(String[] args) {
    int number1 = (int) (long) 1.0D;
    short number2 = 1;
    Short number3 = (Short) (short) (float) 1.0D;
    Object number4 = (int) (Number) (Double) (Object) (double) 2.0D; // ClassCastException (Double cannot be cast to Integer)
    Double number5 = (double) (int) (char) 2.0D;
    Short number6 = getNumber(Short.valueOf("2"));

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number3.doubleValue());
    System.out.println(number4);
    System.out.println(number5);
    System.out.println(number5.doubleValue());
    System.out.println(number6);
    System.out.println(number6.doubleValue());

    System.out.println();

    System.out.println(number1 + number2 + number3.doubleValue()
        + Integer.valueOf(number4.toString()) + number5.doubleValue() + number6.doubleValue());
  }

  static <T> T getNumber(T number) {
    return number;
  }
}
