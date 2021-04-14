package String;

import java.util.Scanner;

public class Naive_Pattern_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = " ", p = " ";
			s = sc.next();
			p = sc.next();
			// Search scr = new Search();
			if (Search.search2(p, s) == true)
				System.out.println("yes");
			else
				System.out.println("no");

		}

	}
}

class Search {

	static boolean search(String pat, String txt) {

		int n = txt.length();
		int m = pat.length();
		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (pat.charAt(j) != txt.charAt(i + j))
					break;
			}
			if (j == m)
				return true;
			if (j == 0)
				i++;
			else
				i = (i + j);

		}
		return false;

	}

	static boolean search1(String pat, String txt) {

		int n = txt.length();
		int m = pat.length();
		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (pat.charAt(j) != txt.charAt(i + j))
					break;
			}
			if (j == m)
				return true;

		}
		return false;
	}

	static boolean search2(String pat, String txt) {
		if (txt.contains(pat))
			return true;
		else
			return false;

	}

}
