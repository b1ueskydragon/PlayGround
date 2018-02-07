package quiz2018;

import java.util.ArrayList;
import java.util.List;

public class ArrayIterationChallenge {
  public static void main(String... args) {
    List<String> list = new ArrayList<>();

    list.add("var1");
    list.add("var2");
    list.add("var3");
    list.add("var4");
    list.add("var5");

    for (String var : list) {
      if (var.equals("var2")) list.remove(var); // ConcurrentModificationException
    }

    System.out.println(list);
  }
}
