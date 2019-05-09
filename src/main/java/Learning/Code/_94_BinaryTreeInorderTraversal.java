package Learning.Code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal_Recursion(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();

		if (root != null) {
			this.dfs(root, result);
		}
		return result;
	}

	private void dfs(TreeNode curr, List<Integer> result) {
		if (curr.left != null)
			this.dfs(curr.left, result);
		result.add(curr.val);
		if (curr.right != null)
			this.dfs(curr.right, result);
	}

	public List<Integer> inorderTraversal_NoRecursion(TreeNode root) {
//		define a stack
//		curr = root
//	    add curr into stack
//		while stack is not empty
//		 		if curr.left != null
//					push left into stack
//					curr = curr.left
//				else
//					curr = stack pop
//					do sth
//					if curr.right != null
//		    			add curr into stack
//						curr = curr.right
//		end while

		List<Integer> result = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		if (root != null) {
			TreeNode curr = root;
			stack.push(curr);
			while (!stack.isEmpty()) {
				if (curr.left != null) {
					stack.push(curr.left);
					curr = curr.left;
				} else {
					curr = stack.pop();
					result.add(curr.val);
					if (curr.right != null) {
						stack.push(curr.right);
						curr = curr.right;
					}
				}
			}
		}
		return result;
	}

}
