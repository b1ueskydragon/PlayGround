package code.with.play;

import java.util.Arrays;


public class ByteLength {

  private int test(String value) {
    int sum = 0;
    for (char c : value.toCharArray()) {
      if (String.valueOf(c).getBytes().length > 1) {
        sum += 1;
      } else {
        sum += 0.5;
      }
    }
    return sum;
  }


  public static void main(String [] args) {

    String value = "ぎゃおー！";
    char [] chars = value.toCharArray();

    long zen = Arrays.asList(chars) // char []
        .stream()
        .map(c -> String.valueOf(c).getBytes().length)
        .filter(l -> l > 1)
        .count();

    Arrays.asList(value).stream().map(cs -> value.toCharArray()).forEach(System.out::println);



   System.out.println( new ByteLength().test(value));


  }
}
