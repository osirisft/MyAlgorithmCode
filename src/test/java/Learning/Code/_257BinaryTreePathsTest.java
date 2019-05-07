package Learning.Code;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

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
		List<String> result = o.binaryTreePaths(t1);
		Assert.assertEquals("1->2", result.get(0));
		Assert.assertEquals("1->3", result.get(1));
	}

}
