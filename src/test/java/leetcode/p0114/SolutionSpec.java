package leetcode.p0114;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SolutionSpec {

  private final Solution underTest = new Solution();
  private final Solution01 underTestB = new Solution01();


  @Test
  public void testFlatten() {
    final var root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(6);

    underTest.flatten(root);

    assertThat(1, equalTo(root.val));
    assertThat(null, equalTo(root.left));
    assertThat(2, equalTo(root.right.val));
    assertThat(null, equalTo(root.right.left));
    assertThat(3, equalTo(root.right.right.val));
    assertThat(null, equalTo(root.right.right.left));
    assertThat(4, equalTo(root.right.right.right.val));
    assertThat(null, equalTo(root.right.right.right.left));
    assertThat(5, equalTo(root.right.right.right.right.val));
    assertThat(null, equalTo(root.right.right.right.right.left));
    assertThat(6, equalTo(root.right.right.right.right.right.val));
  }

  @Test
  public void testFlattenB() {
    final var root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(6);

    underTestB.flatten(root);

    assertThat(1, equalTo(root.val));
    assertThat(null, equalTo(root.left));
    assertThat(2, equalTo(root.right.val));
    assertThat(null, equalTo(root.right.left));
    assertThat(3, equalTo(root.right.right.val));
    assertThat(null, equalTo(root.right.right.left));
    assertThat(4, equalTo(root.right.right.right.val));
    assertThat(null, equalTo(root.right.right.right.left));
    assertThat(5, equalTo(root.right.right.right.right.val));
    assertThat(null, equalTo(root.right.right.right.right.left));
    assertThat(6, equalTo(root.right.right.right.right.right.val));
  }

  @Test
  public void testFlattenZigZagRoot() {
    final var root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    root.right.left.right = new TreeNode(4);

    underTest.flatten(root);

    assertThat(1, equalTo(root.val));
    assertThat(null, equalTo(root.left));
    assertThat(2, equalTo(root.right.val));
    assertThat(null, equalTo(root.right.left));
    assertThat(3, equalTo(root.right.right.val));
    assertThat(null, equalTo(root.right.right.left));
    assertThat(4, equalTo(root.right.right.right.val));
  }

}
