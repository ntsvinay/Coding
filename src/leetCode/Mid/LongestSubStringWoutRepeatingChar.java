package leetCode.Mid;

public class LongestSubStringWoutRepeatingChar {
	String mainWord = "";

	String longestWord = "";
	int flag = 0;

	/*
	 * public int lengthOfLongestSubstring(String s) { for (int i = 0; i <
	 * s.length(); i++) { if (longestWord.indexOf(s.charAt(i)) == -1) { longestWord
	 * = longestWord + "" + s.charAt(i); flag++; } else { if (s.length() - flag
	 * >=longestWord.length()) { mainWord = longestWord; longestWord = "";
	 * longestWord = longestWord + "" + s.charAt(i); flag++; } } } return
	 * mainWord.length() > longestWord.length() ? mainWord.length() :
	 * longestWord.length();
	 * 
	 * }
	 */
	public boolean checkRepition(String str, int strt, int end) {
		int[] chArr = new int[130];

		for (int i = strt; i <= end; i++) {
			char ch = str.charAt(i);
			chArr[ch]++;
			if (chArr[ch] > 1) {
				return true;
			}
		}

		return false;
	}

	public int getLongestSubString(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (!checkRepition(str, i, j)) {
					res = Math.max(res, j - i + 1);
					System.out.print("char " + res);
				}
				System.out.println();
			}

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(new LongestSubStringWoutRepeatingChar().getLongestSubString("abcabcbb"));
	}

}
