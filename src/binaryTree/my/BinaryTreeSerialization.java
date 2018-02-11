package binaryTree.my;

import java.util.ArrayList;
import java.util.List;

/**
 * @challenger b1ueskydragon
 */
public class BinaryTreeSerialization {

  // a node instance
  private static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    String getNodeAsString(Node node) {
      return String.valueOf(node.data);
    }
  }

  // append node as String
  // O(N) 意識 - 再帰の場合?
  private static List<String> serialize(Node node, List<String> result) {
    if (node == null) {
      result.add("[null]");
      return result;
    }

    result.add(("[" + node.getNodeAsString(node) + "]"));
    serialize(node.left, result);
    serialize(node.right, result);
    return result;
  }

  private static List<Node> deserialize(String data) {
    return null;
  }

  public static void main(String... args) {
    Node root = new Node(4);
    root.left = new Node(3);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(5);
    root.right.right = new Node(6);

    List<String> result = new ArrayList<>();

    serialize(root, result).forEach(System.out::print);

  }
}