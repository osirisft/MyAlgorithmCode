package Learning.Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _236_LowestCommonAncestor {

	private List<LinkedList<TreeNode>> pathList = new ArrayList<LinkedList<TreeNode>>();

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		List<TreeNode> targetList = new ArrayList<TreeNode>();
		targetList.add(p);
		targetList.add(q);
		this.buildPathMap(root, targetList);
		return q;
	}

	private void buildPathMap(TreeNode root, List<TreeNode> targetList) {
		LinkedList<TreeNode> pathStack = new LinkedList<TreeNode>();
		this.dfs(root, targetList, pathStack);
	}

	private void dfs(TreeNode curr, List<TreeNode> targetList, LinkedList<TreeNode> pathStack) {
		pathStack.push(curr);
		if (this.isTarget(curr, targetList)) {
			pathList.add(pathStack);
		} else {
			if (curr.left != null)
				this.dfs(curr.left, targetList, pathStack);
			if (curr.right != null)
				this.dfs(curr.right, targetList, pathStack);
		}
		pathStack.pop();
	}
 
	private boolean isTarget(final TreeNode curr, List<TreeNode> targetList) {
		return targetList.stream().anyMatch(node -> {
			return curr.val == node.val ? true : false;
		});
	}
}