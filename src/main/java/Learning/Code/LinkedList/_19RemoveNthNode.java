package Learning.Code.LinkedList;

import java.util.ArrayList;
import java.util.List;

import Learning.Code.ListNode;

public class _19RemoveNthNode {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr = null, nextNode = null;
		List<ListNode> list = new ArrayList<ListNode>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		list.remove(list.size() - n);
		for (int i = list.size() - 1; i >= 0; i--) {
			nextNode = i == list.size() - 1 ? null : list.get(i + 1);
			curr = list.get(i);
			curr.next = nextNode;
		}
		return curr;
	}
}
