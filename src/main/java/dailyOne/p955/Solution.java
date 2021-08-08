package dailyOne.p955;

/**
 * Arithmetic Expression Tree.
 * - Each leaf is an integer and each internal node is on of '+', '-', '*', '/'.
 * - Each node of a binary expression tree has zero or two children.
 */
public class Solution {
  public int aet(final Node root) {
    return calcAet(root).acc;
  }

  private Node calcAet(final Node root) {
    if (root == null) {
      return null;
    }

    final Node leftChild = calcAet(root.left);
    final Node rightChild = calcAet(root.right);

    // if isDigit, current node is a leaf node.
    root.acc = Character.isDigit(root.value) ?
        Character.getNumericValue(root.value) : operate(root.value, leftChild.acc, rightChild.acc);

    return root;
  }

  private int operate(final char o,
                      final int x,
                      final int y) {
    switch (o) {
      case '+':
        return x + y;
      case '-':
        return x - y;
      case '*':
        return x * y;
      case '/':
        return x / y;
      default:
        throw new IllegalArgumentException("no such operator.");
    }
  }
}

class Node {
  char value;
  Node left;
  Node right;

  int acc; // current node's accumulation so far.

  Node() { }

  Node(char value) {
    this.value = value;
  }
}
