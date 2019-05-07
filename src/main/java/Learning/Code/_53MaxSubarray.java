package Learning.Code;

public class _53MaxSubarray {
	public static int maxSubArray(int[] nums) {

		int max = Integer.MIN_VALUE, preSum = 0;

		for (int i = 0; i < nums.length; i++) {
			max = nums[i] > max ? nums[i] : max;
			preSum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				preSum += nums[j];
				max = preSum > max ? preSum : max;
			}
			preSum = 0;
		}
		return max;

	}

}
