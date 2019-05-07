package Learning.Code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _257BinaryTreePaths {

	List<String> pathCollection = new ArrayList<String>();
	LinkedList<TreeNode> pathStack = new LinkedList<TreeNode>();

	public List<String> binaryTreePaths(TreeNode root) {

//		1. curr = root
//		2. push curr into pathStack
//		3. if curr has left, curr = curr.left, go to 2
//		4. if curr has right, curr = curr.right, go to 2
//		5. reverse pathStack and add pathStack into pathCollection
//		6. pathStack pop

		TreeNode curr = root;
		this.traverse(curr);
		return this.pathCollection;
	}

	private void traverse(TreeNode curr) {
		this.pathStack.push(curr);
		if (curr.left != null)
			traverse(curr.left);
		if (curr.right != null)
			traverse(curr.right);

		StringBuilder sb = new StringBuilder();
		Iterator<TreeNode> it = this.pathStack.descendingIterator();
		while (it.hasNext()) {
			sb.append(String.valueOf(it.next().val));
			if (it.hasNext())
				sb.append("->");

		}
		this.pathCollection.add(sb.toString());
		sb.setLength(0);

		if (!this.pathStack.isEmpty()) {
			this.pathStack.pop();
		}
	}

}
