package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		//using stream api
		int[] arr1 = { 1, 2, 4, 6, 8 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		int[] arr4= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
		int add=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sum();
		System.out.println(add);

		//using while loop

		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}

		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		for (int a : arr3) {
			System.out.print(a);//1234456678
		}
		System.out.println();
		for (int a : arr4) {
			System.out.print(a);//1234456678
		}
	}
}
