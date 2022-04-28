package array;

public class AddTwoSameContinouNumberPlaceZeroAndShiftZeroToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8 };
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] == number[i + 1]) {
				number[i] = number[i] + number[i + 1];
				number[i + 1] = 0;
			}
		}
		System.out.println("after adding same number");
		for (int a : number) {
			System.out.print(a);
		}
		int k = 0;
		for (int j = 0; j < number.length - 1; j++) {
			if (number[j] != 0) {
				number[k++] = number[j];
			}
		}
		while (k < number.length) {
			number[k++] = 0;
		}
		System.out.println();
		System.out.println("after siftting zero to left");
		for (int a : number) {
			System.out.print(a);
		}
	}

}
