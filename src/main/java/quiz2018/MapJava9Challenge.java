package quiz2018;

import java.util.List;
import java.util.Map;

public class MapJava9Challenge {
  public static void main(String... args) {
    Map<String, String> map = Map.of("no", "bugs", "no2", "stress"); // .of() returns an immutable map.

    map.put("Do", "YourBest"); // UnsupportedOperationException

    map.forEach((k, v) -> { if (k == "no") map.remove(k); }); // UnsupportedOperationException

    System.out.println(map);


    List<String> list = List.of("a", "b", "c"); // .of() returns an immutable list.
    list.add("d"); // UnsupportedOperationException
    System.out.println(list);
  }
}
