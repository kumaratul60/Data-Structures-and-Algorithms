package Mathmetics;

import java.util.Scanner;

public class Sum_powerDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(sum(n));
		}

	}

	static int sum(int n) {
		int res = 0;
		int ans = 0;
		int tans = 0;

		res = (int) Math.pow(2, n);

		while (res > 0) {
			int lastDigit = res % 10;
			ans += lastDigit;
			res /= 10;
		}
		while (ans > 0) {

			int lastDigit = ans % 10;
			tans += lastDigit;
			ans /= 10;
		}

		return tans;

	}

}
