package practise;

public class FindMaxNumberInText {
	public int findMaxNumber(String text) {
		int max = 0;
		text = text.replaceAll("[^\\d]", " ");
		text = text.trim();

		// Replace all the consecutive white
		// spaces with a single space
		text = text.replaceAll(" +", " ");

		if (text.equals(""))
			return -1;
		int[] intArr = new int[text.length()];
		System.out.println(text);
		for (int i = 0; i < text.length(); i++) {
			intArr[i] = Integer.valueOf(text.charAt(i));

		}
		for (int a : intArr) {
			System.out.print(a + ",");

		}
		for (int i = 0; i < intArr.length; i++) {
			int val = intArr[i];
			if (max < val) {
				max = val;
			}

		}
		return max;

	}

	public static void main(String[] args) {
		String str = "1as44dfr454d4fr";
		System.out.println(new FindMaxNumberInText().findMaxNumber(str));
	}

}
