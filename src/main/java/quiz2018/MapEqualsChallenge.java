package quiz2018;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEqualsChallenge {
  public static void main(String... args) {
    Map<Stark, String> map = new LinkedHashMap<>();

    map.put(new Stark("Arya"), "1");
    map.put(new Stark("Ned"), "2");
    map.put(new Stark("Sansa"), "3");
    map.put(new Stark("Bran"), "4"); // 4文字で key が同じなのでここの value に上書きされる
    map.put(new Stark("Jaime"), "5"); // 5文字で key が同じなのでここの value に上書きされる

    map.forEach((k, v) -> System.out.println(v));

//    for (Stark s : map.keySet()) {
//      System.out.println(s.name);
//      System.out.println(map.get(s));
//    }
  }

  static class Stark {
    String name;

    Stark(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      return ((Stark) obj).name.length() == this.name.length();
    }

    @Override
    public int hashCode() {
      return 4000 << 2 * 2000 / 10000;
    }
  }
}
