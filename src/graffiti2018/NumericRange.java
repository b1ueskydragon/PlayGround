package graffiti2018;

public class NumericRange {
  public static void main(String... args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE); // scala> Long.MaxValue

    Long maxValL = (Long.MAX_VALUE >> (2 * 16)) + 1;

    System.out.println(maxValL - 1 == Integer.MAX_VALUE);

    System.out.println(0xffffffffL);

    System.out.println((Integer.MAX_VALUE + 1) & 0xFFFFFFFFL);

    // (Long.MaxValue >> (2 * 16)) + 1 == 2147483648
    // ((Long.MaxValue >> (2 * 16)) * 2) + 1 == 4294967295. max value of unsigned int
  }
}
