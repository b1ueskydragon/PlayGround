package dailyOne.P07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @b1lueskydragon
 */
public class DecodeCase {

  /**
   * make a dict int : char
   *
   * @return map
   */
  // TODO 不要 (1~26 の数字比較で住む)
  private static Map<Integer, Character> createEncodeMapping() {
    Map<Integer, Character> encodeMap = new HashMap<>();
    IntStream.rangeClosed(1, 26).forEach(i -> encodeMap.put(i, (char) (i + 96)));
    return encodeMap;
  }

  private static String encoder(int k) {
    return String.valueOf((char) (k + 96));
  }


  private static int count = 1;

  /**
   * count all of the decode cases
   *
   * @param msg message that given
   * @return case of decode
   */
  private static int countDecodeCase(String msg) {
    int parseMsg = Integer.parseInt(msg);
    if (parseMsg < 11) return 1;
    if (parseMsg < 27) return 2;

    return countHelper(msg);
  }

  private static int countHelper(String msg) {
    for (int i = 1; i <= 2; i++) {
      String tail = msg.substring(i);

      if (Integer.parseInt(tail) < 27) {
        count += 1;
      }

      if (tail.length() > 2) {
        tail = tail.substring(i);
        countDecodeCase(tail);
      }
    }
    return count;
  }

  public static void main(String... args) {
    System.out.println(countDecodeCase("1")); // 'a' -> 1
    System.out.println(countDecodeCase("11")); // 'aa' 'k' -> 2
    System.out.println(countDecodeCase("111")); // 'aaa' 'ka 'ak' -> 3
    System.out.println(countDecodeCase("1111")); // 'aaaa' 'aak' 'aka'    'kk' 'kaa' -> 5


    System.out.println(countDecodeCase("12345")); // 3


//    System.out.println("12345".substring(1).substring(1));
  }
}
