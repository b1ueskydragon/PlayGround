package quiz2018;

// bit wise: ビット演算
// an unsigned integer containing n bits can have a value between 0 and 2^n - 1
public class BitWiseChallenge {

  private static final int BIT_NUMBER = 6;

  public static void main(String... args) {
    int bitwise = BIT_NUMBER >>> 1; // 110(binary number)を1bit右へシフト(符号なし)

    System.out.println(Integer.toBinaryString(BIT_NUMBER)); // 符号なし整数型をstringに返す(2進数)
    System.out.println(Integer.toBinaryString(bitwise));
  }
}
