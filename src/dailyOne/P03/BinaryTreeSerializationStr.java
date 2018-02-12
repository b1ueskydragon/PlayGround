package dailyOne.P03;

/**
 * @challenger b1ueskydragon
 */
public class BinaryTreeSerializationStr {

  // a node instance
  private static class Node {
    Integer data = null;
    Node left;
    Node right;

    Node(Integer data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    int getNodeAsInteger(Node node) {
      return node.data;
    }
  }

  private static final String NONE = ".";

  // append node as String
  // O(N) 意識 - 再帰の場合?
  private static String serialize(Node node) {
    if (node == null) {
      return NONE;
    }
    return node.getNodeAsInteger(node) + serialize(node.left) + serialize(node.right); // root-node 足しがない場合, 再び登る際に上書きされる
  }

  private static Node deserialize(String serial) {
    if (serial.isEmpty()) return null;
    String[] datas = serial.split("");

    return deserializeRecursion(datas, 0);
  }

  private static Node deserializeRecursion(String[] datas, int i) {
    String data = datas[i++];
    if (data.equals(NONE)) return null;

    Node node = new Node(Integer.parseInt(data));
    node.left = deserializeRecursion(datas, i++);
    node.right = deserializeRecursion(datas, i);

    return node;
  }

  public static void main(String... args) {
    Node root = new Node(4);
    root.left = new Node(3);
    root.left.left = new Node(1);
    root.left.right = new Node(2);
    root.right = new Node(5);
    root.right.right = new Node(6);

    String serialized = serialize(root);
    System.out.println(serialized);

    Node result = deserialize(serialized);
    System.out.println(result.getNodeAsInteger(result));
    System.out.println(result.getNodeAsInteger(result.left));
    System.out.println(result.getNodeAsInteger(result.left.left));
    System.out.println(result.getNodeAsInteger(result.left.right));
    System.out.println(result.getNodeAsInteger(result.right));
    System.out.println(result.getNodeAsInteger(result.right.right));
  }
}
