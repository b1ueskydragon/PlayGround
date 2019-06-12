package graffiti2018;

import quiz99.P35;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamPra {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    final int given = sc.nextInt();
    sc.close();

    int[] primes = IntStream.rangeClosed(1, given).filter(P35::isPrime).toArray();
    List<Integer> primeLists = IntStream.rangeClosed(1, given).filter(P35::isPrime).boxed().collect(Collectors.toList());
  }
}
