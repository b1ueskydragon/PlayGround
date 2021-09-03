package graffiti2021;

import java.util.concurrent.ThreadLocalRandom;

public class RateByRandomNumber {
  private static double underTest() {
    int count = 0;
    double rate = 0.5;
    double k = 10000d;

    for (int i = 0; i < k; i++) {
      double x = ThreadLocalRandom.current().nextDouble(1.0);
      if (x <= rate) {
        count++;
      }
    }
    return (count / k) * 100; // rate
  }

  public static void main(String[] args) {
    double sum = 0;
    double k = 10000d;
    for (int i = 0; i < k; i++) {
      sum += underTest();
    }
    System.out.println(sum / k);
  }
}
