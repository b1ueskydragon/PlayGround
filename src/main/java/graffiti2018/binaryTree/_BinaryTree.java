package graffiti2018.binaryTree;

import java.util.Comparator;

// BinaryTree
public class _BinaryTree<K, V> {

  private Node<K, V> root;
  private Comparator<? super K> comparator = null;

  // Node
  private static class Node<K, V> {
    private K key;
    private V data;
    private Node<K, V> left;  // left pointer: refers left lode
    private Node<K, V> right; // right pointer: refers right node

    // Constructor
    Node(K key, V data, Node<K, V> left, Node<K, V> right) {
      this.key = key;
      this.data = data;
      this.left = left;
      this.right = right;
    }

    K getKey() {
      return key;
    }

    V getValue() {
      return data;
    }
  }
}
