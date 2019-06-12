package quiz2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrazyCollectionChallenge {
  public static void main(String... args) {

    List<Map<String, Map<String, String>>> crazyList = new ArrayList<>();

    Map<String, Map<String, String>> crazyMap = new HashMap<>();

    crazyMap.put("crazyListKey", new HashMap<>());
    crazyMap.put("crazyListKey", new HashMap<>());
    crazyMap.put("crazyListKeY", new HashMap<>());

    crazyList.add(crazyMap);

    System.out.println(crazyList.get(0).size());
  }
}
