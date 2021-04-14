package Recursiion;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (isPalindrome(s))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	// m1
	public static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0)
			return false;

		for (int i = 0, j = str.length() - 1; i < j; ++i, --j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}

		return true;
	}
	/// m2

	public static boolean isPalindrome(String str, int low, int high) {
		// base case
		if (low >= high) {
			return true;
		}

		// return false if mismatch happens
		if (str.charAt(low) != str.charAt(high)) {
			return false;
		}

		// move to the next pair
		return isPalindrome(str, low + 1, high - 1);
	}

	// m2
	public static boolean isPalindrome1(String str, int low, int high) {
		return (low >= high) || (str.charAt(low) == str.charAt(high) && isPalindrome(str, low + 1, high - 1));
	}

	// m4
	public static boolean isPalindrome1(String str) {

		if (str.length() == 0 || str.length() == 1) {
			return true;
		}

		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindrome(str.substring(1, str.length() - 1));
		}
		return false;
	}
}
