package dailyOne.p752.bfsQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);

    final Solution underTest = new Solution();
    underTest.printNodeLevelWise(root);
  }

  public void printNodeLevelWise(final Node root) {
    final Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      Node parent = queue.poll();

      if (parent.left != null) {
        queue.add(parent.left);
      }
      if (parent.right != null) {
        queue.add(parent.right);
      }

      System.out.printf("%s%s", parent.val, (queue.isEmpty()) ? " " : ", ");
    }
  }

  private static class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
    }
  }
}
