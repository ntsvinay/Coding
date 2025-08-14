package leetCode.Easy;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		char[] chArr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : chArr) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.getLast() == '(') {
				System.out.println("("+stack.getLast());
				stack.pop();

			} else if (c == '}' && !stack.isEmpty() && stack.getLast() == '{') {
				System.out.println("{"+stack.getLast());
				stack.pop();

			} else if (c == ']' && !stack.isEmpty() && stack.getLast() == '[') {
				System.out.println("["+stack.getLast());
				stack.pop();
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		System.out.println(new ValidParentheses().isValid("[({})]"));
	}
}
