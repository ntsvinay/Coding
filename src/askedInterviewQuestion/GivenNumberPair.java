package askedInterviewQuestion;

public class GivenNumberPair {
	
	public static void main(String[] args) {
		int a = 4;
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = i;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i]+","+arr[j]);
				count++;
			}
		}
		System.out.println(count);
	}

}
