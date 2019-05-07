package Learning.Code;

import static org.junit.Assert.*;

import org.junit.Test;

import Learning.Code.LinkedList._19RemoveNthNode;

public class _19RemoveNthNodeTest {

	@Test
	public void test() {
		ListNode ls = new ListNode(1);
		ls.next = new ListNode(2);
		ls.next.next = new ListNode(3);
		ls.next.next.next = new ListNode(4);
		ls.next.next.next.next = new ListNode(5);
		_19RemoveNthNode.removeNthFromEnd(ls, 2);
	}

}
