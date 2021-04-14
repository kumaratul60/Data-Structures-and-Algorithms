package Recursion_ADV;

import java.util.Scanner;

// time complexity = o(2^n);

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			String op = "";
			SubstringPermutation(ip, op);
			System.out.println();
			powerSet(ip, op);
			System.out.println();
			powerSet1(ip, 0, op);
			System.out.println();
		}
	}

	static void SubstringPermutation(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = s.charAt(0);
		String res = s.substring(1);

		SubstringPermutation(res, ans);
		SubstringPermutation(res, ans + ch);

	}

	// Methos 2

	static void powerSet(String ip, String op) {
		if (ip.length() == 0) {
			System.out.print(op + " ");
			return;
		}

		powerSet(ip.substring(1), op);
		powerSet(ip.substring(1), op + ip.charAt(0));

	}

	static void powerSet1(String s, int i, String ans) {
		if (i == s.length()) {
			System.out.print(ans + " ");
			return;
		}
		
		powerSet1(s, i + 1, ans + s.charAt(i));
		powerSet1(s, i + 1, ans);

	}

}
