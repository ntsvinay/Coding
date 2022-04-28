package leetCode.Easy;

public class LongestCommonPrefix {
	public String findLongest(String[] strArr) {
		String strRtrnVal = "";
		String temp = "";
		String strWord = strArr[0];
		if (strWord == "" || strWord == null)
			return "";
		for (int j = 1; j < strArr.length; j++) {
			while (strArr[j].indexOf(strWord) != 0) {
				strWord = strWord.substring(0, strWord.length() - 1);
			}

		}
		return strWord;

		/*
		 * for (int i = 0; i < strWord.length(); i++) { temp = temp + "" +
		 * strWord.charAt(i); for (int j = 1; j < strArr.length; j++) { if (strArr[j] ==
		 * "" || strArr[j] == null) return ""; if (strArr[j].startsWith(temp)) { } else
		 * { return strRtrnVal; }
		 * 
		 * } strRtrnVal = strRtrnVal + "" + strWord.charAt(i); }
		 * 
		 * return strRtrnVal;
		 */

	}

	public static void main(String[] args) {
		String str[] = { "flo", "flow", "flight" };
		System.out.println(new LongestCommonPrefix().findLongest(str));
	}

}
