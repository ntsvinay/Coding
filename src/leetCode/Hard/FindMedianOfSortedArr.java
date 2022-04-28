package leetCode.Hard;

import java.util.Arrays;

public class FindMedianOfSortedArr {

	boolean isOdd;
	int length;

	public int[] mergeSortedArr(int a[], int b[]) {
		int[] c = new int[a.length + b.length];
		int x = 0, y = 0, z = 0;
		while (a.length > x && b.length > y) {
			if (a[x] < b[y]) {
				c[z++] = a[x++];
			} else {
				c[z++] = b[y++];
			}
		}
		while (a.length > x) {
			c[z++] = a[x++];
		}
		while (b.length > y) {
			c[z++] = b[y++];
		}
		return c;

	}

	void getLength(int[] arr) {

		if (arr.length % 2 == 0) {
			length = arr.length / 2;
			isOdd = false;
		} else {
			length = arr.length / 2;
			isOdd = true;
		}

	}

	float getMedianOfArr(int[] arr) {
		getLength(arr);
		if (isOdd) {
			return arr[length];
		} else {
			float a = arr[length] + arr[length - 1];
			return a / 2;

		}
		// return isOdd ? arr[length] : (arr[length] + arr[length - 1])/2;

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 3 };
		int[] b = new int[] { 2 };

		int[] a1 = new int[] { 1, 3 };
		int[] b1 = new int[] { 2, 4 };

		FindMedianOfSortedArr obj = new FindMedianOfSortedArr();
		int[] c = obj.mergeSortedArr(a1, b1);
		System.out.println(Arrays.toString(c));
		System.out.println(obj.getMedianOfArr(c));
	}

}
