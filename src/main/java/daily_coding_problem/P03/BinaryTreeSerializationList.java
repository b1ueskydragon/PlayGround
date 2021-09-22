package daily_coding_problem.P03;

import java.util.ArrayList;
import java.util.List;

/**
 * @challenger b1ueskydragon
 */
public class BinaryTreeSerializationList {

  // a node instance
  private static class Node {
    Integer data = null;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    Integer getNodeAsInteger(Node node) {
      return node.data;
    }
  }

  private static String NONE = "";

  private static List<String> serialize(Node node, List<String> result) {
    if (node == null) {
      result.add(NONE);
      return result;
    }

    result.add(String.valueOf(node.getNodeAsInteger(node)));
    serialize(node.left, result);
    serialize(node.right, result);
    return result;
  }

  private static Node deserialize(List<String> serial) {
    if (serial.isEmpty()) return null;
    return dataToNode(serial);
  }

  private static int point = 0;

  private static Node dataToNode(List<String> serial) {
    if (point >= serial.size()) return null; // searched all of the split datas

    if (serial.get(point).equals(NONE)) {
      point++; // go to the next point even if node is null
      return null; // empty node
    }

    Node node = new Node(Integer.parseInt(serial.get(point))); // root
    point++;

    node.left = dataToNode(serial);
    node.right = dataToNode(serial);
    return node;
  }

  public static void main(String... args) {
    Node root = new Node(4);
    root.left = new Node(3);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(5);
    root.right.right = new Node(6);

    List<String> result = new ArrayList<>();
    List<String> seResult = serialize(root, result);
    seResult.forEach(System.out::print);
    System.out.println();

    Node newTree = deserialize(seResult);
    System.out.println(newTree.getNodeAsInteger(newTree));
    System.out.println(newTree.getNodeAsInteger(newTree.left));
    System.out.println(newTree.getNodeAsInteger(newTree.left.left));
    System.out.println(newTree.getNodeAsInteger(newTree.left.right));
    System.out.println(newTree.getNodeAsInteger(newTree.right));
    System.out.println(newTree.getNodeAsInteger(newTree.right.right));
  }
}