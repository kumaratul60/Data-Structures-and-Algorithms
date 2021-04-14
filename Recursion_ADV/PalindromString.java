package Recursion_ADV;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			// String op = "";
			//palindromePartitioning(ip, "");
			System.out.println(isPalim(ip, 0, ip.length()-1));
			System.out.println(isPalindrome(ip));

		}
	}

	static void palindromePartitioning(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			String roq = ques.substring(i);
			String op = ques.substring(0, i);

			if (isPalindrome(op))
				palindromePartitioning(roq, ans + op + " ");

		}
	}

	static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static boolean isPalim(String s, int left, int right) {
		
	//int  left = 0,right = s.length()-1;
		
		if (left >= right)
			return true;
		if (s.charAt(left) != s.charAt(right))
			return false;

		return isPalim(s, left + 1, right - 1);
	}

}
