package leetCode.Mid;

class Rotate {
	public int[] rotate(int[] nums, int k) {
		k=k%nums.length;

		/*
		 * int end = nums.length; int mid = end - k; int beg = 0; if (end % 2 == 0) {
		 * while (mid < end) { int temp = nums[beg]; nums[beg] = nums[mid]; nums[mid] =
		 * temp; ++beg; ++mid; } } else { while (mid < end) { int temp = nums[beg];
		 * nums[beg] = nums[mid]; nums[mid] = temp; beg++; mid++; }
		 * 
		 * int pend = (mid - 1) / 2; int pVal = nums[pend];
		 * 
		 * System.out.println(pend +"--"+pVal+ "--" + beg + "--" + mid); // for (int i =
		 * pend; i < end; i++) { int i = pend; while (i < end-1) { nums[i] = nums[i +
		 * 1]; i++; } nums[i] = pVal; }
		 */
		/*
		 * for (int i = 0; i < k; i++) { int temp = nums[end]; for (int j = end; j >= 1;
		 * j--) { nums[j] = nums[j - 1]; } nums[0] = temp; }
		 */

		reverseArr(nums, 0, nums.length-1);
		reverseArr(nums, 0, k-1);
		reverseArr(nums, k, nums.length-1);
		
		return nums;
	}

	public void reverseArr(int[] arr, int start, int end) {
		while (start < end) {
			int tem = arr[start];
			arr[start] = arr[end];
			arr[end] = tem;
			end--;
			start++;

		}
	}

	public static void main(String[] args) {
		int[] reslt = new Rotate().rotate(new int[] { 1, 2}, 3);
		System.out.println("Final --");
		for (int a : reslt) {
			System.out.print(a + " ");
		}
	}
}