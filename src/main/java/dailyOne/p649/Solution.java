package dailyOne.p649;

public class Solution {

  public Character firstRecurringChar(String str) {
    if (str == null || str.isEmpty()) {
      return null;
    }
    char[] ary = str.toCharArray();
    char prev = ary[0];
    for (int i = 1; i < str.length(); i++) {
      char curr = ary[i];
      if (prev == curr) {
        return curr;
      }
      prev = curr;
    }
    return null;
  }

}
