package leetCode.Hard;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class SubstringwithConcatenationofAllWords {
	int currentIndex = 0;

	public List<Integer> findSubstring(String s, String[] words) {
		Set<Integer> arrSet = new LinkedHashSet();
		List<Integer> arrList = new LinkedList<>();
		List<String> list = permutations(words, 0, new ArrayList<String>());
		for (String str : list) {
			if (s.indexOf(str) != -1) {
				arrSet.add(s.indexOf(str));
			}

		}
		for (int str : arrSet) {
			arrList.add(str);

		}
		return arrList;
	}

	private static List<String> permutations(String[] chars, int currentIndex, List<String> list) {
		if (currentIndex == chars.length - 1) {
			String combi = "";
			for (String word : chars) {
				combi = combi + word;
			}
			list.add(combi);
			System.out.println(combi);
		}
		for (int i = currentIndex; i < chars.length; i++) {
			swapWords(chars, currentIndex, i);
			permutations(chars, currentIndex + 1, list);
			swapWords(chars, currentIndex, i);
		}
		return list;
	}

	public static void swapWords(String arr[], int strt, int end) {
		String str = arr[strt];
		str = arr[strt];
		arr[strt] = arr[end];
		arr[end] = str;
	}

	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		List<Integer> ll = new SubstringwithConcatenationofAllWords().findSubstring(s, words);
		System.out.println("List: " + ll);
	}
}