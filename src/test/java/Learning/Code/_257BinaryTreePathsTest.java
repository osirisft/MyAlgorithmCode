package Learning.Code;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Learning.Code.Tree._257BinaryTreePaths;
import junit.framework.Assert;

public class _257BinaryTreePathsTest {

	@Test
	public void test() {
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t1 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;

		_257BinaryTreePaths o = new _257BinaryTreePaths();
		List<String> result = o.binaryTreePaths_Original(t1);
		Assert.assertEquals("1->2", result.get(0));
		Assert.assertEquals("1->3", result.get(1));
	}

	@Test
	public void test_BFS_1() {
		TreeNode t5 = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t1 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.right = t5;

		_257BinaryTreePaths o = new _257BinaryTreePaths();
		List<String> result = o.binaryTreePaths_BFS(t1);
		Assert.assertEquals("1->2->5", result.get(0));
		Assert.assertEquals("1->3", result.get(1));
	}

	@Test
	public void test_BFS_2() {
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t1 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;

		_257BinaryTreePaths o = new _257BinaryTreePaths();
		List<String> result = o.binaryTreePaths_BFS(t1);
		Assert.assertEquals("1->2", result.get(0));
		Assert.assertEquals("1->3", result.get(1));
	}
}
