package Recursion_ADV;

import java.util.Scanner;

public class RemoveDuplicate_recur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			System.out.println(removeDup(ip));
		}
	}

	static String removeDup(String s) {
		if (s.length() == 0) {
			return "";
		}
		char ch = s.charAt(0);
		String ans = removeDup(s.substring(1));
		if (ch == ans.charAt(0)) {
			return ans;
		}
		else
			return (ch + ans);
	}

}
