package practise;

public class SameZeroLeft {
	public static void main(String[] args) {
		int[] intAr = { 1, 2, 2, 5, 5, 6, 8, 9, 9 };
		int k = 0;
		for (int i = 0; i < intAr.length - 1; i++) {
			if (intAr[i] == intAr[i + 1]) {
				intAr[i] = intAr[i] + intAr[i + 1];
				intAr[i + 1] = 0;

			}
		}
		for (int val : intAr) {
			System.out.print("-"+val);
		}
		int j=0;
		System.out.print("||");
		while (k < intAr.length) {

			if(intAr[k]!=0)
			{
				intAr[j++]=intAr[k];
			}
			k++;
		}

		while(j< intAr.length)
		{
			intAr[j++]=0;

		}

		for (int val : intAr) {
			System.out.print("-"+val);
		}
	}
}
