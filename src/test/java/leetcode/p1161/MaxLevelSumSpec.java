package leetcode.p1161;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxLevelSumSpec {

  private final Solution01 b = new Solution01();

  @Test
  public void testMaxLevelSumFromNotBalancedTreeAndHasNegateValues() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(-4); // depth 3
    root.right.left = new TreeNode(5);// depth 3
    root.right.right = new TreeNode(6);  //depth 3
    root.right.left.left = new TreeNode(-7);
    root.right.left.right = new TreeNode(8);
    root.right.right.left = new TreeNode(9);
    root.right.right.right = new TreeNode(-10);
    root.right.left.left.left = new TreeNode(-11);
    root.right.left.right.left = new TreeNode(12);
    assertEquals(3, b.maxLevelSum(root));
  }

}
