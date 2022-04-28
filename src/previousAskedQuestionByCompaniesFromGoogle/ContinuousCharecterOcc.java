package previousAskedQuestionByCompaniesFromGoogle;

import java.util.ArrayList;

public class ContinuousCharecterOcc {
	public static void main(String[] args) {
		String str = "AAAABBCCAA";
		ArrayList<String> cout = new ArrayList<>();
		char[] strChar = str.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			int count = 1;
			for (int j = i + 1; j < strChar.length; j++) {

				if (strChar[i] == strChar[j]) {
					i++;
					count++;
				} else {
					break;
				}

			}
			cout.add(count + "" + strChar[i]);

		}
		cout.stream().forEach(System.out::println);
	}

}
