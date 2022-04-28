package array;

import java.util.*;
import java.io.*;

class longestSequence {

	public static int LongestIncreasingSequence(int[] arr) {
		// code goes here
		ArrayList<Integer> list = new ArrayList<>();
		if (arr == null || arr.length == 0) {
			return 0;
		} else {
			for (int num : arr) {
				if (list.size() == 0 || num > list.get(list.size() - 1)) {
					list.add(num);
				} else {
					int i = 0;
					int j = list.size() - 1;
					while (i < j) {
						int mid = (i + j) / 2;
						if (list.get(mid) < num) {
							i = mid + 1;
						} else {
							j = mid;
						}
					}
					list.set(j, num);
				}
			}

		}
		return list.size();
	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.print(LongestIncreasingSequence(new int[] {4, 0,1,2,3,6,4}));
	}

}