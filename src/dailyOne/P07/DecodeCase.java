package dailyOne.P07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @b1lueskydragon
 */
public class DecodeCase {

  private static String encode(int k) {
    return String.valueOf((char) (k + 96));
  }

  /**
   * count all of the decode cases
   *
   * @param msg message that given
   * @return case of decode
   */
  private static int countDecodeCase(String msg) {
    Set<String> resultSet = new HashSet<>();
    List<String> resultList = new ArrayList<>();
    int count = 1;

    int parseMsg = Integer.parseInt(msg);
    if (parseMsg < 11) return 1;
    if (parseMsg < 27) return 2;

    for (int i = 0; i < msg.length() - 1; i++) {
      String pair = msg.substring(i, i + 2);

      int parsedPair = Integer.parseInt(pair);

      if (parsedPair < 27) {
        resultList.add(pair);
      }
    }
    return count + resultList.size();
  }

  public static void main(String... args) {
    System.out.println(countDecodeCase("1")); // 'a' -> 1
    System.out.println(countDecodeCase("11")); // 'aa' 'k' -> 2
    System.out.println(countDecodeCase("111")); // 'aaa' 'ka 'ak' -> 3
    System.out.println(countDecodeCase("1111")); // 'aaaa' 'aak' 'aka' 'kk' 'kaa' -> 5
    System.out.println(countDecodeCase("12345")); // 3
  }
}
