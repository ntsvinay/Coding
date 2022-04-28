package leetCode.Easy;

import java.util.*;

class SortedSquares {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int[] reslt = new SortedSquares().sortedSquares(new int[] { -7,-3,2,3,11 });
		for (int a : reslt) {
			System.out.print(a+" ");
		}

	}
}