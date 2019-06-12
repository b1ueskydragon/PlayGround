package quiz99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P35 {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    final int given = sc.nextInt();
    sc.close();
    primeFactors(given).forEach(System.out::println);
  }

  private static List<Integer> primeFactors(int given) {
    List<Integer> rst = new ArrayList<>();
    int[] primes = IntStream.rangeClosed(1, given).filter(P35::isPrime).toArray();

    for (int i = 0; i < primes.length; i++) {
      int current = primes[i];
      if (given % current != 0) continue;

      int tmp = given / current;
      if (tmp % current == 0) i--;
      given = tmp;

      if (given == 0) break;
      rst.add(current);
    }
    return rst;
  }

  public static boolean isPrime(int given) {
    if ((given != 2 && given % 2 == 0) || given < 2) return false;

    for (int i = 3; i * i <= given; i += 2) {
      if (given % i == 0) return false;
    }
    return true;
  }
}
