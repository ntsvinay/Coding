package leetCode.Easy;

public class FindMissingNumberInArr {

	public int findMissingNumber(int arr[]) {
		int missingNum = -1;
		int tNumber = arr.length;
		System.out.println(tNumber);
		int sum = 0;
		for (int val : arr) {
			sum += val;
		}
		int totalSum = tNumber * (tNumber + 1) / 2;
		System.out.println(totalSum + "-" + sum + "-" + tNumber / 2);
		missingNum = (int) (totalSum - sum);

		return missingNum;

	}

	public static void main(String[] args) {

		System.out.println(new FindMissingNumberInArr().findMissingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
	}

}
