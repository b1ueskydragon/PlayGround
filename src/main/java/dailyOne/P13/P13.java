package dailyOne.P13;

import java.util.HashMap;
import java.util.Map;

public class P13 {

  private static int lengthLongestSubstring(String s, int k) {
    if (k == 0 || s == null || s.length() == 0)
      return 0;

    if (s.length() < k) {
      return s.length();
    }

    Map<Character, Integer> map = new HashMap<>(); // 順序は保証されない

    int maxLen = k;
    int start = 0; // start point lefter than current

    // O(N)
    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);

      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1); // {文字 : i 時点での個数} 紐づけ
      } else {
        map.put(c, 1);
      }

      // 異なる文字数が k を超えた場合
      if (map.size() > k) {
        maxLen = Math.max(maxLen, i - start); // 現在最高記録を覚えておく (k 通りの最小限の文字数 vs この時点での長さ. map は dynamic に変わるので)

        while (map.size() > k) {

          char fc = s.charAt(start);

          if (map.get(fc) == 1) {
            map.remove(fc);
          } else {
            map.put(fc, map.get(fc) - 1);
          }

          start++;
        }
      }
    }

    maxLen = Math.max(maxLen, s.length() - start); // 現在最高記録, 更新されるか?

    return maxLen;
  }

  public static void main(String... args) {
    System.out.println(lengthLongestSubstring("aabbbccd", 3));
  }
}
