package Recursion_ADV;

import java.util.Scanner;

public class ClimbingStairs_Or_coinChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int current = sc.nextInt();
			int n = sc.nextInt();
			String ans = "";
			climbingStairs(current, n, ans);
			// climbingStairs(0,5,"");

		}
	}

	static void climbingStairs(int curr, int n, String s) {
		if (curr == n) {
			System.out.println(s);
			return;
		}
		if (curr > n)
			return;

		climbingStairs(curr + 1, n, s + "1");
		climbingStairs(curr + 2, n, s + "2");
		climbingStairs(curr + 3, n, s + "3");
		climbingStairs(curr + 4, n, s + "4");

	}
}
