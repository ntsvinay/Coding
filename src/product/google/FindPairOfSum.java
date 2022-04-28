package product.google;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfSum {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 4, 4 };
		int sum = 5;
		System.out.println(new FindPairOfSum().findSum(arr, sum));
		System.out.println(new FindPairOfSum().findSumArSorted(arr, sum));
	}

	public boolean findSum(int arr[], int sum) {
		Set<Integer> comp = new HashSet<>();

		for (int val : arr) {
			System.out.println("val:"+val+",sum-val"+(sum-val));
			if (comp.contains(val)) {
				return true;
			} else {
				comp.add(sum - val);
			}

		}
		return false;
	}
	
	public boolean findSumArSorted(int arr[], int sum)
	{
		int beg=0;
		int end=arr.length-1;
		int sum_1=0;
		while(beg<end)
		{
			sum_1=arr[beg]+arr[end];
			if(sum_1==sum)
				return true;
			else if(sum_1<8)
				beg++;
			else
				end--;
			
		}
		
		return false;
		
	}

}
