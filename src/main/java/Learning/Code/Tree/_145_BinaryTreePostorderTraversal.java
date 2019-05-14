package Learning.Code.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Learning.Code.TreeNode;

public class _145_BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal_recursion(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		TreeNode curr = root;
		this.dfs(curr, result);
		return result;

	}

	private void dfs(TreeNode curr, List<Integer> result) {
		if (curr.left != null)
			this.dfs(curr.left, result);
		if (curr.right != null)
			this.dfs(curr.right, result);
		result.add(curr.val);
	}

	public List<Integer> postorderTraversal_NoRecursion(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		if (root == null)
			return result;

		TreeNode curr = root, preNode = null;
		stack.push(curr);
		while (!stack.isEmpty()) {
			curr = stack.getFirst();
			if ((curr.left == null && curr.right == null) || (preNode != null && preNode.val == curr.left.val)
					|| (preNode != null && preNode.val == curr.right.val)) {
				curr = stack.pop();
				preNode = curr;
				result.add(curr.val);
			} else {
				if (curr.right != null)
					stack.push(curr.right);
				if (curr.left != null)
					stack.push(curr.left);
			}
		}
		return result;
	}

	private boolean isChildVisited(TreeNode pre, TreeNode curr) {
		boolean isVisited = false;
		if (pre != null) {

		}
		return isVisited;
	}

}
