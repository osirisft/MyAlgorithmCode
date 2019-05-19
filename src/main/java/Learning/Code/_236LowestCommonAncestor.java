package Learning.Code;

import java.util.ArrayList;
import java.util.List;

public class _236LowestCommonAncestor {
	List<TreeNode> path = new ArrayList<TreeNode>();

//	public TreeNode lowestCommonAncestor_1(TreeNode root, TreeNode p, TreeNode q) {
////		find the path from root to p
////		find the path from root to q
////		find the joint point of the 2 paths
//
//		return q;
//
//	}
//
//	public TreeNode findParentPreOrderTraversal(TreeNode curr, TreeNode target) {
//		TreeNode parent = null;
//		if ((curr.left != null && curr.left.val == target.val)
//				|| (curr.right != null && curr.right.val == target.val)) {
//			return curr;
//		}
//		if (curr.left != null) {
//			parent = this.findParentPreOrderTraversal(curr.left, target);
//			if (parent != null)
//				return parent;
//		}
//		if (curr.right != null) {
//			this.findParentPreOrderTraversal(curr.right, target);
//			if (parent != null)
//				return parent;
//		}
//		return parent;
//	}
//
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
////		1. find which input node is the loweer one
////			1.1 if higher node does not have a parent, return higer node 
////		2. find parent: input->the higher node
////		3. find parent: input->the lower node
////		4. compare ancestor
////			4.1 if equal, return result
////			4.2 if not, find parent: input-> lower node's ancestor. then go to 4
//
//		TreeNode resultNode = null;
//
//		return resultNode;
//	}
//
//	private TreeNode findParnt(TreeNode root, TreeNode target) {
////		1. curr = root
////		2. if curr.left == target || curr.right == target return curr
////		3. if not, curr = curr.left
////		
//		TreeNode curr = root;
//		do {
//			if (curr.left.val == target.val || curr.right.val == target.val) {
//				return curr;
//			} else {
//
//			}
//
//		} while (curr.left != null || curr.right != null);
//		return curr;
//
//	}
}
