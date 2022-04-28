package leetCode.Easy;

class MajorityElement {
	public int majorityElement(int[] nums) {
		int maxCount = 0;
		int count = 0;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

			}
			if (maxCount <= count) {
				index = i;
				maxCount=count;
			}
		}
		return nums[index];

	}

	public static void main(String[] args) {
		System.out.println(new MajorityElement().majorityElement(new int[] { 3, 3, 4 }));
	}
}