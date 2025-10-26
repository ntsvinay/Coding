package array;

public class TwoSortedArray {

	public static void main(String[] args) {
		String aa = "vinay";
		String ab = "kumar";
		/*
		 * int a[] = { 1, 2, 3, 4 }; int b[] = { 3, 4, 6, 7, 8 }; int c[] = new
		 * int[a.length + b.length];
		 */
		char[] a = aa.toCharArray();
		char[] b = ab.toCharArray();
		char[] c = new char[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];

			/*
			 * if (a[i] < b[j]) { c[k++] = a[i++]; } else { c[k++] = b[j++]; }
			 */
		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}
		/*
		 * for (int ca : c) { System.out.println(ca); }
		 */
		System.out.println(new String(c));
	}
}