package Learning.Code;

import static org.junit.Assert.*;

import org.junit.Test;

import Learning.Code.Tree._145_BinaryTreePostorderTraversal;

public class _145_BinaryTreePostorderTraversalTest {

	@Test
	public void test() {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;

		_145_BinaryTreePostorderTraversal o = new _145_BinaryTreePostorderTraversal();
		o.postorderTraversal_NoRecursion(t1);
	}

}
