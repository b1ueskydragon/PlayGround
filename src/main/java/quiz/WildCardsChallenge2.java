package quiz;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class WildCardsChallenge2 {

  public static void main(String[] args) {
    wild(new Generic<String>());
    List<Number> list = wild2(new ArrayList<Number>()); // Object cannot be cast to Number

    list.forEach(System.out::println); // list.size() == 3, but throws cast exception

//    for (Object o : list) {
//      System.out.println(o);
//    } // it' s ok !
  }

  static class Generic<T extends Object> {
  }

  static <T extends Object> void wild(Generic<T> generic) {
    System.out.println("wild1");
  }

  static <T> List<T> wild2(List<T> list) {
    list.add((T) new Object());
    list.add((T) new String());
    list.add((T) Double.valueOf("3"));

    return list;
  }
}