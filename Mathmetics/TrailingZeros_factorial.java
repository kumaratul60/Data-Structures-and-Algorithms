package Mathmetics;

import java.util.Scanner;

public class TrailingZeros_factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(t0s(n));
		}

	}

	static int t0s(int n) {
		int res = 0;
		for (int i = 5; i <= n; i *= 5)
			res += n / i;
		return res;

	}

}
