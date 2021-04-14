package Recursion_ADV;

import java.util.Scanner;

public class MazePath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(mazePath(0, 0, n - 1, m - 1, ""));

		}
	}

	static int mazePath(int cr, int cc, int er, int ec, String op) {
		if (cr == er && cc == ec) {
			System.out.println(op);
			return 1;
		}
		if (cr > er || cc > ec)
			return 0;

		int cand1 = mazePath(cr, cc + 1, er, ec, op + "R"); // right
		int cand2 = mazePath(cr + 1, cc, er, ec, op + "D"); // bottom
		return cand1 + cand2;
	}

}
