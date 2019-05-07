package Learning.Code;

public class _2Add2Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode curr = null, header = new ListNode(0), dummyHeader = null;
		dummyHeader = header;
		int sum = 0, p = 0, q = 0, carry = 0;
		while (l1 != null || l2 != null) {
			p = l1 != null ? l1.val : 0;
			q = l2 != null ? l2.val : 0;
			sum = p + q + carry;
			carry = sum - 10 >= 0 ? 1 : 0;

			curr = new ListNode(sum % 10);
			dummyHeader.next = curr;
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
			dummyHeader = dummyHeader.next;
		}
		if (carry > 0) {
			dummyHeader.next = new ListNode(carry);
		}
		return header.next;
	}
}
