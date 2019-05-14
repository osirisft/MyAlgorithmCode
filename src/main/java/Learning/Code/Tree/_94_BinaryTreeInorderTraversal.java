package Learning.Code.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Learning.Code.TreeNode;

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
//		whihle curr not null || stack not null
//			while 
//				find each left child and put them into stack
//				until there is no left child
//			end while
//			curr = stack.pop
//			do sth
//			curr = curr.right
//		end while

		List<Integer> result = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		if (root != null) {
			TreeNode curr = root;
			while (curr != null | !stack.isEmpty()) {
				while (curr != null) {
					stack.push(curr);
					curr = curr.left;
				}
				curr = stack.pop();
				result.add(curr.val);
				curr = curr.right;
			}
		}
		return result;
	}

}
