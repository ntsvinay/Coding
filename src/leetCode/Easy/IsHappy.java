package leetCode.Easy;

class IsHappy {
	public boolean isHappy(int n) {
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			temp = temp * temp;
			sum = sum + temp;
			n = n / 10;
		}
		isHappy(sum);
		if (sum == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(new IsHappy().isHappy(19));
	}
}