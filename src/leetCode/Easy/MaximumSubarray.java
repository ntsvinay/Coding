package leetCode.Easy;

class MaximumSubarray {
	int maxSum = 0;

	public int maxSubArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			findMaxSum(nums, i, nums.length);
		}
		return maxSum;

	}

	public int findMaxSum(int[] arr, int beg, int end) {
		int tempSum = 0;
		while (beg > end) {
			tempSum += arr[beg];
			beg++;
		}
		if (tempSum > maxSum) {
			maxSum = tempSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumSubarray().maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}