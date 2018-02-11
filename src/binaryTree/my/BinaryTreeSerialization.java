package binaryTree.my;
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

    int getNodeAsInt(Node node) {
      return node.data;
    }
  }

  // append node as String
  private static String serialize(Node node, String result) {
    if (node == null) {
      return "null";
    }
    result += node.getNodeAsInt(node);
    serialize(node.left, result);
    serialize(node.right, result);
    return result;
  }

  private static Node deserialize(String data) {
    return null;
  }

  public static void main(String... args) {
    Node root = new Node(4);
    root.left = new Node(3);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(5);

    String result = "";

    System.out.println(serialize(root, result));
  }
}