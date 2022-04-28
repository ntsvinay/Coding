package leetCode.Mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> rtnList = new LinkedList<>();
		// { "eat", "tea", "tan", "ate", "nat", "bat" };
		for (int i = 0; i < strs.length; i++) {
			// List<String> ll = new LinkedList<>();
			Set<String> ll = new HashSet<>();
			for (int j = i + 1; j < strs.length; j++) {
				if (!rtnList.contains(strs[j])) {
					if (isAna(strs[i], strs[j])) {
						ll.add(strs[j]);
					}
				}

			}
			ll.add(strs[i]);
			List<String> temp = new LinkedList<>();
			for (String s : ll) {
				temp.add(s);
			}
			rtnList.add(temp);
		}
		return rtnList;

	}

	public boolean isAna(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			s1.toLowerCase();
			s2.toLowerCase();

			char[] s1Arr = s1.toCharArray();
			char[] s2Arr = s2.toCharArray();

			Arrays.sort(s1Arr);
			Arrays.sort(s2Arr);
			return Arrays.equals(s1Arr, s2Arr);
		}

	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(new GroupAnagrams().groupAnagrams(strs));
	}
}// [["bat"],["nat","tan"],["ate","eat","tea"]]