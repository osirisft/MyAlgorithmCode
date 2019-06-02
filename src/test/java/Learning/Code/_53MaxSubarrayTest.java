package Learning.Code;

import org.junit.Test;

import junit.framework.Assert;

public class _53MaxSubarrayTest {

	@Test
	public void test() {
		int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Assert.assertEquals(6, _53MaxSubarray.maxSubArray(input));

		int[] input2 = { 1, 2 };
		Assert.assertEquals(3, _53MaxSubarray.maxSubArray(input2));
	}

}
