package quiz;

import java.util.Arrays;
import java.util.List;

public class StreamChallenge6 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 6, 7, 90, 100);

    list.stream()
        .takeWhile(e -> e < 100) // 対象にしたいデータの条件
        .dropWhile(e -> e < 50) // 対象外にしたいデータ
        .forEach(System.out::println);
  }
}
