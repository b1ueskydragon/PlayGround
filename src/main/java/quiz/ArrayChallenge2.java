package quiz;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayChallenge2 {
  public static void main(String... args) {
    int[] anyArray = new int[5];
    anyArray[0] = 0;
    anyArray[1] = 2;
    anyArray[2] = 4;
    anyArray[3] = 6;
    anyArray[4] = 8;

    int[] otherArray = anyArray;
    doSumStream(anyArray);
    doSumStream(otherArray);

    Arrays.stream(anyArray).forEach(System.out::println);
  }

  private static void doSum(int[] anyArray) {
    for (int i = 0; i < anyArray.length; i++) {
      anyArray[i] += 2;
    }
  }

  private static void doSumStream(int[] anyArray) {
    IntStream.range(0, anyArray.length).forEach(i -> anyArray[i] += 2);
  }
}
