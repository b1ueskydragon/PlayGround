package quiz2018;

/**
 * (a Part's of language specification)
 *
 * a range of Integer, autoboxing or Wrappers.
 */
@Deprecated
public class IntegerChallenge {

  public static void main(String... args) {
    /**
     * number 1 and 2 taken from constant pool [-128; 127].
     */
    Integer number1 = 5;
    Integer number2 = 5;

    /**
     * number 3 and 3 are created from scratch.
     */
    Integer number3 = 128;
    Integer number4 = 128;

    int number5 = 128;

    Integer number6 = 127;
    Integer number7 = 127;

    Integer number8 = -128;
    Integer number9 = -128;

    Integer number10 = -129;
    Integer number11 = -129;

    /**
     * [[ == ]] compares references, not values.
     */
    System.out.println(number1 == number2); // t

    System.out.println(number3 == number4); // f

    System.out.println(number3 == number5); // t

    System.out.println(number6 == number7); // t

    System.out.println(number8 == number9); // t

    System.out.println(number10 == number11); // f

    System.out.println(new Integer(1) == new Integer(1)); // f
  }
}
