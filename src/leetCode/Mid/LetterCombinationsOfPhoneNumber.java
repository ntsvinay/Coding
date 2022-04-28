package leetCode.Mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	/*
	 * final char[][] aa = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g',
	 * 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, {
	 * 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
	 */

	public List<String> letterCombinations(String digits) {

		LinkedList<String> listArr = new LinkedList<>();
		if (digits.length() <= 0)
			return listArr;
		listArr.add("");
		String[] wrdsArr = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		for (int i = 0; i < digits.length(); i++) {
			int index = Character.getNumericValue(digits.charAt(i));
			while (listArr.peek().length() == i) {
				String permutation = listArr.remove();
				for (char indChar : wrdsArr[index].toCharArray()) {
					listArr.add(permutation + indChar);
				}
			}

		}

		return listArr;
	}

	public static void main(String[] args) {

		System.out.println(new LetterCombinationsOfPhoneNumber().letterCombinations("23"));
	}

}
