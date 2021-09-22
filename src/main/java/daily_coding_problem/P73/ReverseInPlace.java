package daily_coding_problem.P73;

import java.util.LinkedList;

// Given the head of a singly linked list, reverse it in-place.
public class ReverseInPlace {
  public static void main(String... args) {

    LinkedList<String> lst = new LinkedList<>();
    lst.add("A");
    lst.add("B");
    lst.add("C");
    lst.add("D");

    reverse(lst, lst.size() - 1);
    lst.forEach(System.out::println);
  }

  private static <T> void reverse(LinkedList<T> curr, int insertPoint) {
    if (insertPoint == 0) return;

    T head = curr.getFirst();
    curr.removeFirst();
    curr.add(insertPoint, head);
    reverse(curr, insertPoint - 1);
  }
}
