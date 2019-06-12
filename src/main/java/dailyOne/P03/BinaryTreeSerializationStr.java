package dailyOne.P03;

/**
 * @challenger b1ueskydragon
 * should be O(N): it O(N) even if it's recursion, cause it visits through each node
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

  private static final String NONE = "";

  // append node as String
  private static String serialize(Node node) {
    if (node == null) {
      return NONE;
    }
    // if forgot to add root-node at first every each time, data of node will be overwritten when recursion-depth begins reduction
    return node.getNodeAsInteger(node) + serialize(node.left) + serialize(node.right);
  }

  private static Node deserialize(String serial) {
    if (serial.isEmpty()) return null;
    String[] datas = serial.split("");

    return deserializeRecursion(datas);
  }

  private static int i = 0; // `i` should be placed outside the scope of the recursion(function)

  private static Node deserializeRecursion(String[] datas) {
    if (i >= datas.length) {
      return null;
    }

    if (datas[i].equals(NONE)) {
      i++; // move a pointer for a next recursion
      return null;
    }

    Node node = new Node(Integer.parseInt(datas[i++])); //  move a pointer for a next recursion
    node.left = deserializeRecursion(datas);
    node.right = deserializeRecursion(datas);

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
