package Recursion_ADV;

import java.util.Scanner;

public class Permutation_String {

	public static void main(String[] args) {
		// permutation("abc", "");
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String s = sc.next();

//			code(s);
//			System.out.println();
			permutation(s,"");
		}

	}

	static String code(String s) {
		permutation(s, "");
		return "";
	}

	static void permutation(String s, String ans) {

		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); // current charecter

			String ros = s.substring(0, i) + s.substring(i + 1); // rest of string after cutting out ch;
			permutation(ros, ans + ch);
		}
	}

}
