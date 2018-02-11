package binaryTree.my;

import javax.swing.tree.TreeNode;

/**
 * Q https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
 * A https://www.geeksforgeeks.org/serialize-deserialize-binary-tree/
 * another https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
 *
 * @challenger b1ueskydragon
 * serialize which stores the tree into an array A[ ]
 * and deSerialize which deserializes the array to tree and returns it
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
  }

  // a Tree
  private static class BinaryTree {
    Node root;
    int[] path = new int[1000];

    int getNodeAsInt(Node node) {
      return node.data;
    }

    boolean isBottom(Node node) {
      return node.left == null && node.right == null;
    }

    boolean hasLeft(Node node) {
      return node.left != null;
    }

    boolean hasRight(Node node) {
      return node.right != null;
    }
  }

  // append node as String
  private static String serialize(BinaryTree tree, Node node, String result) {
    if (node == null) {
      return "null";
    }
    result += tree.getNodeAsInt(node);
    serialize(tree, node.left, result);
    serialize(tree, node.right,result);
    return result;
  }

  private static BinaryTree deserialize(String data) {
    return null;
  }

  public static void main(String... args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(4);
    tree.root.left = new Node(3);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(2);
    tree.root.right = new Node(5);

    String result = "";

    System.out.println(serialize(tree, tree.root, result));
  }
}
