package dailyOne.P06;

import java.util.LinkedList;

/**
 * @b1ueskydragon
 * XOR linked list: ビットごとのXOR連結リスト
 * doubly linked list: 連結リスト
 */
public class XORLinkedList<E> {

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

  }

  // Returns the node at index
  public E get(int index) {
    return node.item;
  }

  public static void main(String... args) {
    new LinkedList<Integer>(); // see
    System.out.println(5 ^ 3); // 101(5) XOR 011(3) == 110(2) == 6
  }
}
