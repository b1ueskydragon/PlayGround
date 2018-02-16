package dailyOne.P07;

/**
 * @b1ueskydragon
 */
public class DecodeCase {

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
    if (msg.length() == 0) { // basic case
      return 1;
    }
    int count = 0; // out scope of for loop
    for (int i = 1; i <= 2; i++) {
      if (i > msg.length()) {
        continue; // skip this loop ?
      }
      String head = msg.substring(0, i);
      String tail = msg.substring(i);

      if (head.startsWith("0") || Integer.parseInt(head) > 26) {
        break;
      }
      count += countHelper(tail);
    }
    return count;
  }

  public static void main(String... args) {
    System.out.println(countDecodeCase("1")); // 'a' -> 1
    System.out.println(countDecodeCase("11")); // 'aa' 'k' -> 2
    System.out.println(countDecodeCase("111")); // 'aaa' 'ka 'ak' -> 3
    System.out.println(countDecodeCase("1111")); // 'aaaa' 'aak' 'aka' 'kk' 'kaa' -> 5
    System.out.println(countDecodeCase("12345")); // 3
  }
}
