package leetCode.Mid;

public class ReversrInt {

	public int reverse(int num) {

		int signMultiplier = 1;

		if (num < 0) {
			signMultiplier = -1;
			num = signMultiplier * num;
		}

		int temp = 0, num1 = 0;
		while (num > 0) {
			if (num1 * signMultiplier > Integer.MAX_VALUE / 10 || num1 * signMultiplier < Integer.MIN_VALUE / 10) {
				return 0;
			}
			temp = num % 10;
			num1 = num1 * 10 + temp;
			num = num / 10;

		}

		return num1 * signMultiplier;
	}

	public static void main(String[] args) {
		int num = -2147483412;
		System.out.println(new ReversrInt().reverse(num));
	}

}
