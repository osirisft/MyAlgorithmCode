package Learning.Code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class _2Add2NumbersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		_2Add2Numbers solution = new _2Add2Numbers();
		ListNode ln = solution.addTwoNumbers(l1, l2);
	}

	@Test
	public void test2() {
		ListNode l1 = new ListNode(5);

		ListNode l2 = new ListNode(5);

		_2Add2Numbers solution = new _2Add2Numbers();
		ListNode ln = solution.addTwoNumbers(l1, l2);
	}

}
