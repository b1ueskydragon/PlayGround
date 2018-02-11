package dailyOne.P03;

/**
 * @challenger b1ueskydragon
 */
public class BinaryTreeSerialization_ {

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
  // O(N) 意識 - 再帰の場合?
  private static String serialize(Node node, String result) {
    if (node == null) {
      return "[null]";
    }

    // result += ("[" + node.getNodeAsInt(node) + "]");
    return node.getNodeAsInt(node) + serialize(node.left, result) + serialize(node.right, result); // root-node 足しがない場合, 再び登る際に上書きされる
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
//    root.right.right = new Node(6);

    String result = "";
    System.out.println(serialize(root, result));
  }
}
