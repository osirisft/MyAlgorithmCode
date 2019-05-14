package Learning.Code;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Learning.Code.Tree._94_BinaryTreeInorderTraversal;
import junit.framework.Assert;

public class _94_BinaryTreeInorderTraversalTest {

	@Test
	public void test() {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;

		_94_BinaryTreeInorderTraversal o = new _94_BinaryTreeInorderTraversal();
		List<Integer> act = o.inorderTraversal_NoRecursion(t1);
		Assert.assertEquals(1, act.get(0).intValue());
		Assert.assertEquals(3, act.get(1).intValue());
		Assert.assertEquals(2, act.get(2).intValue());
	}

	@Test
	public void test1() {
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t1 = new TreeNode(1);
		t3.left = t1;
		t2.left = t3;

		_94_BinaryTreeInorderTraversal o = new _94_BinaryTreeInorderTraversal();
		List<Integer> act = o.inorderTraversal_NoRecursion(t2);
		Assert.assertEquals(1, act.get(0).intValue());
		Assert.assertEquals(3, act.get(1).intValue());
		Assert.assertEquals(2, act.get(2).intValue());
	}

}
