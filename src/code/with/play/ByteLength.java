package code.with.play;

import java.util.Arrays;


public class ByteLength {

  /** 文字が半角か判定する. ただし, 動作が担保できているのは日本語のみ.
   * ~\u007e(英数字), \u00a5(バックスラッシュ), \u203e(チルダ), \uff61 ~ \uff9f(半角カナ)は半角扱い.
   *
//   * @param c 文字.
   * @return 半角ならばtrue.
   */
//  def isHalfWidth(c: Char): Boolean = (c <= '\u007e') || (c == '\u00a5') || (c == '\u203e') || (c >= '\u007e')

  private static void charAndCode() {

//    char c= '\u007e';
//    System.out.println(c);
//
//    char c1 = '\u203e';
//    char c2 = '\u007e';
//
//    System.out.println(c1);
//    System.out.println(c2);
//    System.out.println(c2 > c1);

    char[] chars = {'\u007f', '\u203e', '\u00a5', '\u007e'};

    Arrays.asList(chars).forEach(System.out::println);


  }



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


   // Another Test
    charAndCode();


  }
}
