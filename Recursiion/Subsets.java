package Recursiion;

import java.util.Collections;
import java.util.Scanner;

public class Subsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int index = 0;
			String str = "";
			powerSet(s, index, str);
		
			System.out.println();

		}
	}

	static void powerSet(String s, int index, String curr) {
		int n = s.length();
		if (index == n) {
			System.out.print(curr + " ");
			return;
		}
		powerSet(s, index + 1, curr + s.charAt(index));
		powerSet(s, index + 1, curr);
		
	}

}
