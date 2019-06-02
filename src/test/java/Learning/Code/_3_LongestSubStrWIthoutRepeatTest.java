package Learning.Code;

import org.junit.Test;

import junit.framework.Assert;

public class _3_LongestSubStrWIthoutRepeatTest {

	@Test
	public void test() {

		String s = "abcabcbb";
		_3_LongestSubStrWIthoutRepeat o = new _3_LongestSubStrWIthoutRepeat();
		Assert.assertEquals(3, o.lengthOfLongestSubstring(s));
	}

	@Test
	public void test1() {

		String s = "dvdf";
		_3_LongestSubStrWIthoutRepeat o = new _3_LongestSubStrWIthoutRepeat();
		Assert.assertEquals(3, o.lengthOfLongestSubstring(s));
	}

}
