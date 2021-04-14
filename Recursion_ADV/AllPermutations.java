package Recursion_ADV;

import java.util.Scanner;

public class AllPermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			String op = "";
			allPermutation(ip, op);
		}
	}

	static void allPermutation(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String res = str.substring(0, i) + str.substring(i + 1);
			allPermutation(res, ans + ch);
		}

	}

}
