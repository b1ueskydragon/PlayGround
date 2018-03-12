package quiz2018;

/**
 * A range of Integer, autoboxing or Wrappers.
 */
public class IntegerChallenge {

  public static void main(String... args) {
    Integer number1 = 5;
    Integer number2 = 5;

    Integer number3 = 128;
    Integer number4 = 128;

    int number5 = 128;

    Integer number6 = 127;
    Integer number7 = 127;

    Integer number8 = -128;
    Integer number9 = -128;

    Integer number10 = -129;
    Integer number11 = -129;

    System.out.println(number1 == number2); // t

    System.out.println(number3 == number4); // f

    System.out.println(number3 == number5); // t

    System.out.println(number6 == number7); // t

    System.out.println(number8 == number9); // t

    System.out.println(number10 == number11); // f

    System.out.println(new Integer(1) == new Integer(1)); // f
  }
}
