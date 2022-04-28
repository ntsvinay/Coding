package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*arr = [-5,4,6,-3,4,-1]. Find Largest Sum Contiguous Subarray.
Output: 11
[4,6,-3,4]*/
public class FindMaxSum {

	public int findMax(int[] num) {
		int sum = 0;
		List<Integer> lst = null;
		HashMap<Integer, List<Integer>> sumMap = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			lst = new ArrayList<>();
			sum = 0;
			for (int j = i; j < num.length; j++) {
				sum += num[j];
				lst.add(num[j]);

			}
			sumMap.put(sum, lst);
		}
		System.out.println(sumMap);
		return sum;

	}

	public int findMaxsum(int[] a) {
		int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr = { -5, 4, 6, -3, 4, -1 };
		int [] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		new FindMaxSum().findMax(a);
		System.out.println(new FindMaxSum().findMaxsum(arr));
	}

}
