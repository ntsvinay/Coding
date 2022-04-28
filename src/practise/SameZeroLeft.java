package practise;

public class SameZeroLeft {
	public static void main(String[] args) {
		int[] intAr = { 1, 2, 4, 5, 5, 6, 8, 9, 9 };
		int k = 0;
		for (int i = 0; i < intAr.length - 1; i++) {
			if (intAr[i] == intAr[i + 1]) {
				intAr[i] = intAr[i] + intAr[i + 1];
				intAr[i + 1] = 0;

			}
		}
		for (int val : intAr) {
			System.out.print(val);
		}
		
		
		while (k < intAr.length) {
			intAr[k]=0;

		}
		for (int val : intAr) {
			System.out.print("-"+"\n"+val);
		}
	}
}
