package Backtracking;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		permutations(str, 0, str.length() - 1);
	}

	private static void permutations(String str, int left, int right) {

		if (left == right) {
			System.out.println(str);
			return;
		}
		for (int i = left; i <= right; i++) {

			// do
			str = swap(str, left, i);
			// recurr
			permutations(str, left + 1, right);
			// undo
			str = swap(str, left, i);
		}

	}

	static String swap(String s, int left, int right) {

		char temp;
		char[] CharA = s.toCharArray();
		temp = CharA[left];
		CharA[left] = CharA[right];
		CharA[right] = temp;

		return String.valueOf(CharA);
	}

}
