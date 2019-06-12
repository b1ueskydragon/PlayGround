package dailyOne.P06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @b1ueskydragon
 * XOR linked list: ビットごとのXOR連結リスト
 * doubly linked list: 連結リスト
 */
public class XORLinkedList<E> {

  private List<Object> elements;

  private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
      this.item = element;
      this.prev = prev; // the previous node
      this.next = next; // which is a XOR of the next node
    }
  }

  // A node
  private Node<E> node;
  // size of List
  private int size = 0;

  // Adds the element to the end
  public void add(E e) {
    elements.add(e); // TODO 暫定
  }

  // Returns the node at index
  public Node<E> get(int index) {
    return node;
  }

  public static void main(String... args) {
    new LinkedList<Integer>(); // see
    new ArrayList<Integer>(); // see
    System.out.println(5 ^ 3); // 101(5) XOR 011(3) == 110(2) == 6
  }
}
