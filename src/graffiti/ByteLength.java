package graffiti;

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



  private int max;

  private boolean isByteSizeValid(String value) {

    float len = 0f;

    for (char c : value.toCharArray()) {
      System.out.println(c);

      boolean isHalfWidth =
          (c <= '\u007e') || (c == '\u00a5') || (c == '\u203e') || (c >= '\uff61' && c <= '\uff9f');

      len += isHalfWidth ? 0.5f : 1.0f; // int だと少数の足し算が不正確
    }

    System.out.println(len);

    return (len <= max);
  }


  private boolean isByteSizeValid_original(String value) {

    int len = 0;
    for (char c : value.toCharArray()) {
      if (String.valueOf(c).getBytes().length > 1) {
        len += 2;
      } else {
        len += 1;
      }
    }

    System.out.println(len);

    if (len > max) {
      return false;
    }
    return true;
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

//    String value = "ぎゃおー！";
//    char [] chars = value.toCharArray();
//
//    long zen = Arrays.asList(chars) // char []
//        .stream()
//        .map(c -> String.valueOf(c).getBytes().length)
//        .filter(l -> l > 1)
//        .count();
//
//    Arrays.asList(value).stream().map(cs -> value.toCharArray()).forEach(System.out::println);
//
//
//
//   System.out.println( new ByteLength().test(value));
//
//
//   // Another Test
//    charAndCode();

    ByteLength byteLength = new ByteLength();
    byteLength.max = 40;
  //  System.out.println(byteLength.isByteSizeValid("aasdfsaaaaaaaaaaaaaaaaaaaaaaaaaasdfsdfsadfsaasdfsdfsadfsaasdfsdfsadfaaaaaaaaaaaa"));



    System.out.println(byteLength.isByteSizeValid_8("DRAGON"));



  }


 // 最終形態
  private boolean isByteSizeValid_8(String value) {

    double len = value
        .chars() // value 一文字ずつの char コードの IntStream が返ってくる
        .map(c -> isHalfWidth((char)c) ? 1 : 2)
        .sum() * 0.5d; // 省略しても OK

    System.out.println(len);

    return (len <= max);
  }

  private boolean isHalfWidth(char c) {
    return (c <= '\u007e') || (c == '\u00a5') || (c == '\u203e') || (c >= '\uff61' && c <= '\uff9f');
  }

}
