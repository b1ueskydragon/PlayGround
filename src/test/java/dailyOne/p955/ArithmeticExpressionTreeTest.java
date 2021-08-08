package dailyOne.p955;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticExpressionTreeTest {

  private Solution underTest = new Solution();

  @Test
  public void shouldCalcArithmeticExpressionTree() {
    {
      /**
       *          (*)
       *         /   \
       *       (+)   (+)
       *      /  \   /  \
       *    (3) (2) (4) (5)
       *
       *  (3 + 2) * (4 + 5)
       *  = 5 * 9
       *  = 45
       */
      final Node root = new Node('*');
      root.left = new Node('+');
      root.right = new Node('+');
      root.left.left = new Node('3');
      root.left.right = new Node('2');
      root.right.left = new Node('4');
      root.right.right = new Node('5');

      assertEquals(45, underTest.aet(root));
    }

    {
      /**
       *         (/)
       *        /  \
       *      (*)  (4)
       *     /  \
       *   (2)  (+)
       *       /   \
       *     (3)   (/)
       *          /   \
       *        (6)  (2)
       *
       *   (2 * (3 + (6 / 2))) / 4
       *   = 12 / 4
       *   = 3
       */

      final Node root = new Node('/');
      root.left = new Node('*');
      root.right = new Node('4');
      root.left.left = new Node('2');
      root.left.right = new Node('+');
      root.left.right.left = new Node('3');
      root.left.right.right = new Node('/');
      root.left.right.right.left = new Node('6');
      root.left.right.right.right = new Node('2');

      assertEquals(3, underTest.aet(root));
    }

    {
      /**
       *      (/)
       *     /  \
       *   (8)  (4)
       *
       *   8 / 4
       *   = 2
       */
      final Node root = new Node('/');
      root.left = new Node('8');
      root.right = new Node('4');

      assertEquals(2, underTest.aet(root));
    }
  }
}
