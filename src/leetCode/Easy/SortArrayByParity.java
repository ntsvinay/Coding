package leetCode.Easy;

public class SortArrayByParity {

	public int[] sortArr(int[] str) {
		int j = -1;
		for (int i = 0; i < str.length; i++) {
			if (str[i] % 2 == 0) {
				j++;
				int temp = str[i];
				str[i] = str[j];
				str[j] = temp;

			}
		}

		return str;
	}

	public static void main(String[] args) {

	}
}
