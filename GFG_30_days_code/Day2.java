package GFG_30_days_code;

import java.util.Scanner;

public class Day2 {

	// Given a positive integer N.
	// You have to find Nth natural number after removing all the numbers containing
	// digit 9 .

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			long n = sc.nextLong();
			System.out.println(findNth(n));
		}
	}

	static long findNth(long n) {
		long res = 0;
		int i = 0;
		while (n > 0) {
			res += Math.pow(10, i) * (n % 9);
			n /= 9;
			i++;
		}
		return res;

	}

	static long findn(long n) {

		String s = "";
		while (n != 0) {
			s = (char) (n % 9 + '0') + s;
			n /= 9;
		}
		return Long.parseLong(s);
	}
}
