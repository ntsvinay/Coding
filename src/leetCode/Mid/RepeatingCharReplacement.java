package leetCode.Mid;

import java.util.Arrays;

public class RepeatingCharReplacement {
	public void characterReplacement(String str, int k) {
		char[] charAr = str.toCharArray();
		char f = charAr[0];
		char s = 0;
		for (char c : charAr) {
			if (c != f) {
				s = c;
				break;
			}
		}

		int i = 0;

		for (i = 0; i < k; i++) {
			if (charAr[i] == f) {
				charAr[i] = s;
			}
		}
		String ss = Arrays.toString(charAr);
		System.out.println(ss);
	}

	public static void main(String[] args) {
		new RepeatingCharReplacement().characterReplacement("AABABBA", 1);
	}

}
