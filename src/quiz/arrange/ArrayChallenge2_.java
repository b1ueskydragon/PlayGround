package quiz.arrange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayChallenge2_ {
  public static void main(String... args) {
    int[] anyArray = new int[5];
    anyArray[0] = 0;
    anyArray[1] = 2;
    anyArray[2] = 4;
    anyArray[3] = 6;
    anyArray[4] = 8;

    int[] otherArray = anyArray;
    doSum(anyArray);
    doSum(otherArray).forEach(System.out::println);
  }

  private static List<Integer> doSum(int[] anyArray) {
    return Arrays.stream(anyArray)
        .mapToObj(i -> i += 2)
        .collect(Collectors.toList());
  }
}
