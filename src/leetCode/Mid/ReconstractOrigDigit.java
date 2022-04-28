package leetCode.Mid;

import java.util.HashMap;

public class ReconstractOrigDigit {
	static HashMap<Number, String> digitMap;

	// Input: s = "owoztneoer"
	// Output: "012"
	public String convertToDigit(String s) {
		int[] count = new int[26];
        int[] digits = new int[10];
        StringBuilder str = new StringBuilder ();
        
        for (char c : s.toCharArray ()) {
            ++count[c - 'a'];
        }
        
        digits[0] = count[25];
        digits[2] = count[22];
        digits[4] = count[20];
        digits[6] = count[23];
        digits[8] = count[6];
        digits[1] = count[14] - digits[0] - digits[2] - digits[4];
        digits[3] = count[7] - digits[8];
        digits[5] = count[5] - digits[4];
        digits[7] = count[18] - digits[6];
        digits[9] = count[8] - digits[5] - digits[6] - digits[8];
        
        for (int i = 0; i < 10; i++) {
            while (digits[i]-- != 0) {
                str.append ((char) (i + 48));
            }
        }
        
        return str.toString ();
    }


	public static void main(String[] args) {

		digitMap = new HashMap<>();
		digitMap.put(0, "zero");
		digitMap.put(1, "one");
		digitMap.put(2, "two");
		digitMap.put(3, "three");
		digitMap.put(4, "four");
		digitMap.put(5, "five");
		digitMap.put(6, "six");
		digitMap.put(7, "seven");
		digitMap.put(8, "eight");
		digitMap.put(9, "nine");

		System.out.println(new ReconstractOrigDigit().convertToDigit("zerozero"));

	}

}
