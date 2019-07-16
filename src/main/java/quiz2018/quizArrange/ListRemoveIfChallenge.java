package quiz2018.quizArrange;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class ListRemoveIfChallenge {
  public static void main(String... args) {
    List<Integer> list = new ArrayList<>();
    list.add(22);
    list.add(23);
    list.add(10);
    list.add(12);
    list.add(13);
    list.add(0);

    Integer a = new Integer(12);

    /* if want to remove element 12, try this (And auto-boxing works). */
    // int a = 12;
    // OR
    // Integer a = 12;

    Integer b = new Integer(22);

    /* Debug: Each elements of list, Integer a and b has different memory address (Not a same instance). */

    list.removeIf(e -> e == a || e.equals(b));

    System.out.println(list); // [23, 10, 12, 13, 0]


    /* Practice */
    String s1 = new String("string-test");
    String s2 = new String("string-test");

    System.out.println(s1 instanceof String); // true
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.hashCode() == s2.hashCode()); // A return typeof hashCode() is int.
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
