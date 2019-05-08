package Learning.Code.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Learning.Code.TreeNode;

public class _257BinaryTreePaths {

	List<String> pathCollection = new ArrayList<String>();

	public List<String> binaryTreePaths_Original(TreeNode root) {

//		1. curr = root
//		2. push curr into pathStack
//		3. if curr has left, curr = curr.left, go to 2
//		4. if curr has right, curr = curr.right, go to 2
//		5. reverse pathStack and add pathStack into pathCollection
//		6. pathStack pop

		if (root != null) {
			LinkedList<TreeNode> pathStack = new LinkedList<TreeNode>();
			TreeNode curr = root;
			this.traverse(curr, pathStack);
		}
		return this.pathCollection;
	}

	private void traverse(TreeNode curr, LinkedList<TreeNode> pathStack) {
		pathStack.push(curr);
		if (curr.left != null)
			traverse(curr.left, pathStack);
		if (curr.right != null)
			traverse(curr.right, pathStack);

		if (curr.left == null && curr.right == null) {
			StringBuilder sb = new StringBuilder();
			Iterator<TreeNode> it = pathStack.descendingIterator();
			while (it.hasNext()) {
				sb.append(String.valueOf(it.next().val));
				if (it.hasNext())
					sb.append("->");
			}
			this.pathCollection.add(sb.toString());
			sb.setLength(0);
		}

		if (!pathStack.isEmpty()) {
			pathStack.pop();
		}
	}

	public List<String> binaryTreePaths_BFS(TreeNode root) {
//		define a queue for node
//		define a que for node path
//		prePath=""
//		add root into que
//		add prePath into quePath
//		while que has value
//			get a node from queue
//			get prePath from quePath
//			currPath = prePath + curr.val
//			if curr is a leaf node, 
//				add currPath into pathCollection
//			if not, 
//				add curr.child into queue
//				child path = currPath + "->"
//				add child path into quePath
//		endwhile

		List<String> pathList = new ArrayList<String>();
		Deque<TreeNode> que = new LinkedList<TreeNode>();
		Deque<String> quePath = new LinkedList<String>();
		if (root == null) {
			return pathList;
		} else {
			TreeNode curr = null;
			String prePath = "";
			que.add(root);
			quePath.addLast(prePath);
			while (!que.isEmpty()) {
				curr = que.removeFirst();
				prePath = quePath.removeFirst();
				String currPath = prePath + String.valueOf(curr.val);
				if (curr.left == null && curr.right == null) {
					pathList.add(currPath);
				} else {
					if (curr.left != null) {
						que.add(curr.left);
						quePath.add(currPath + "->");
					}
					if (curr.right != null) {
						que.add(curr.right);
						quePath.add(currPath + "->");
					}
				}
			}
		}

		return pathList;
	}

}
