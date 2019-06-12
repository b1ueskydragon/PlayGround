package quiz2018;

public class GenericChallenge7 {
  public static void main(String... args) {
    String number = calculate(); // Number など Double より上位なら成り立つ
    System.out.println(number);
  }

  static <T> T calculate() {
    return (T) Double.valueOf(2 + 2);
  }
}
