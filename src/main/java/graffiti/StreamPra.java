package graffiti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamPra {

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    for(Integer i : list1) {
      i *= 2;
      System.out.println(i);
    }

    list1.stream().forEach(i -> i *= 2);

    int[] data = {1, 2, 3};
    IntStream st = Arrays.stream(data);

  }




}
