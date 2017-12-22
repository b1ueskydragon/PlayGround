package quiz;

import java.util.HashSet;
import java.util.Set;

public class SetChallenge {

  public static void main(String... args) {
    Set<Object> set = new HashSet<>();
    set.add(new Simpson("Homer")); // 後ろに hashCode() つけて調べてみればわかる
    set.add(new Simpson("Homer"));
    set.add(new Simpson("Bart"));
    set.add(new Simpson("Bart"));
    set.add(new Simpson("Krusty"));

    System.out.println(set.size());
  }

  static class Simpson {
    String name;

    public Simpson(String name) {
      this.name = name;
    }

    @Override
    public int hashCode() {
      return 1 >> 1 % 500 + 300 / 2000; // 左辺を右へ右辺分シフト (符号あり)
    }

    @Override
    public boolean equals(Object obj) {
      return this.name.equals(((Simpson) obj).name);
    }
  }
}
