package leetCode.Easy;

class isPowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n == 1 || n == 2) {
			return true;
		}
		while (n > 1) {
			if (n % 2 != 0) {
				System.out.println(n + "-s" + n % 2);
				return false;
			}
			n = n / 2;
		}
		System.out.println(n + "-s" + n % 2);
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new isPowerOfTwo().isPowerOfTwo(-16));
	}
}