package leetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSumTarget {

	public int[] findSumArr(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int numFlag = 0;
		for (int val : arr) {

			if (map.containsKey(val)) {
				return new int[] { map.get(val), numFlag };
			} else {
				map.put(target - val, numFlag);
				// set.add(target - val);
			}
			numFlag++;

		}
		return null;
	}

	public static void main(String[] args) {
		TwoSumTarget tm = new TwoSumTarget();
		int[] indexs = tm.findSumArr(new int[] {2,7,11,15}, 9);
		System.out.println(Arrays.toString(indexs));

	}

}
