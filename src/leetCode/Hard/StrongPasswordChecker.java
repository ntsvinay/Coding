package leetCode.Hard;

import java.util.regex.Pattern;

public class StrongPasswordChecker {

	int steps = 4;

	public int strongPassword(String password) {

		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Pattern upCase = Pattern.compile("[A-Z]");
		Pattern lowCase = Pattern.compile("[a-z]");
		Pattern digitCase = Pattern.compile("[0-9]");
		if (password.length() < 6)
			return 6 - password.length();
		if (password.length() > 20)
			return 6;
		/*
		 * if (special.matcher(password).find()) steps--;
		 */
		if (upCase.matcher(password).find())
			steps--;
		if (lowCase.matcher(password).find())
			steps--;
		if (digitCase.matcher(password).find())
			steps--;
		boolean seqCheck = false;
		for (int i = 0; i < password.length() - 2; i++) {
			if (password.charAt(i) == password.charAt(i + 1) && password.charAt(i) == password.charAt(i + 2)) {
				seqCheck = true;
				break;
			}
		}
		if (!seqCheck)
			steps--;
		return steps;
	}

	public static void main(String[] args) {

		System.out.println(new StrongPasswordChecker().strongPassword("aaa123"));
	}

}
