package dailyOne.P03;

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

    Node() {
      this.left = null;
      this.right = null;
    }

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    String getNodeAsString(Node node) {
      return String.valueOf(node.data);
    }
  }

  private static String NONE = ".";

  // append node as String
  // O(N) 意識 - 再帰の場合?
  private static List<String> serialize(Node node, List<String> result) {
    if (node == null) {
      result.add(NONE);
      return result;
    }

    result.add(node.getNodeAsString(node));
    serialize(node.left, result);
    serialize(node.right, result);
    return result;
  }

  private static Node deserialize(Node node, List<String> serial) {
    node.left = dataToNode(serial);
    node.right = dataToNode(serial);
    return node;
  }

  private static Node dataToNode(List<String> serial) {
    int path = (int)serial.stream().filter(s -> !s.equals(NONE)).count();

    int point = path;

    if (serial.get(point).equals(NONE)) {
      return null; // empty node
    }
    return new Node(Integer.parseInt(serial.get(point)));
  }

  public static void main(String... args) {
    Node root = new Node(4);
    root.left = new Node(3);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(5);
    root.right.right = new Node(6);

    List<String> result = new ArrayList<>();
    //StringBuilder sb = new StringBuilder();
    //serialize(root, result).forEach(sb::append);

    List<String> seResult = serialize(root,result);
    seResult.forEach(System.out::print);
    System.out.println();

    Node node = new Node();
    deserialize(node, seResult);
  }
}