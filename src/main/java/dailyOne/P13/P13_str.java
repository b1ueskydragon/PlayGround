package dailyOne.P13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// O(n^2 * k)
// substring そのものを求める
public class P13_str {

  private static String[] longestSubstring(String s, int k) {
    Set<String> set = new HashSet<>();
    String[] currentLongest = {};

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length() + 1; j++) {
        String[] target = s.substring(i, j).split("");
        set.addAll(Arrays.asList(target));
        if (set.size() <= k && target.length > currentLongest.length) {
          currentLongest = target;
        }
        set.clear();
      }
    }
    return currentLongest;
  }


  public static void main(String... args) {
    String s = "aabbcc";
    int k = 2;

    Arrays.asList(longestSubstring(s, k)).forEach(System.out::print);

  }
}
