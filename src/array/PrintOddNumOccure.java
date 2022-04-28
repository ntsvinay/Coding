package array;

import java.util.HashMap;
import java.util.Map;

//Sopra setia
public class PrintOddNumOccure {
	public static void main(String[] args) {

		String s1 = new String("vinay");
		String s2 = new String("vinay");
		System.out.println(s1 == s2);// false
		
		String s3 = new String("vinay");
		String s4 = new String("VINAY");
		System.out.println(s3 == s4);// false
		
		String s5 = new String("vinay");
		String s6 = new String("VINAY");
		System.out.println(s5 = s6);// VINAY
		
		String s7 = "vinay";
		String s8 = "vinay";
		System.out.println(s7 == s8);// true

		int[] intArr = new int[] { 10, 20, 20, 40, 50, 50, 20, 30 };

		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < intArr.length; i++) {
			int val = intArr[i];
			if (hm.containsKey(val)) {
				int val1 = hm.get(val);
				hm.put(intArr[i], ++val1);

			} else {
				hm.put(intArr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> mv : hm.entrySet()) {

			if (mv.getValue() % 2 != 0) {
				System.out.println(mv.getKey());
			}

		}
	}

}
