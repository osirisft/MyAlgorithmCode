package Learning.Code;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class _236_LowestCommonAncestorTest {

	@Test
	public void test() {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;

		_236_LowestCommonAncestor o = new _236_LowestCommonAncestor();
		Assert.assertEquals(1, o.lowestCommonAncestor(t1, t2, t3).val);
	}

}
