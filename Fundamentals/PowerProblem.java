package Fundamentals;

import java.util.Scanner;

public class PowerProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(power(n, r));

		}
	}

	static long power(int n, int p) {
		// Your code here

		if (p == 0) {
			return 1;
		}

		return (n * power(n, p - 1)) % 1000000007;

	}

}
