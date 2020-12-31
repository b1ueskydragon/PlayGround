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
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Node parent = queue.poll();
        if (parent == null) {
          continue;
        }
        System.out.printf("%s ", parent.val);
        queue.add(parent.left);
        queue.add(parent.right);
      }

      if (!queue.isEmpty()) {
        System.out.println(); // end of the level
      }
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
