package leetCode.Easy;

import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicate {
	public int removeDuplicates(int[] nums) {

		int len=nums.length;
		Set<Integer> set = new LinkedHashSet();
		for (int a : nums) {
			set.add(a);
		}
		nums=new int[len];
		int i = 0;
		for (int a : set) {
			nums[i++] = a;
		}
		
		return i;

	}

	public static void main(String[] args) {
		System.out.println(new RemoveDuplicate().removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}
}