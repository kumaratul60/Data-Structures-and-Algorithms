package MagicNumber;

import java.util.Scanner;

public class Can_u_guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// System.out.println(base9(n));
			System.out.println(guess(n));
		}
	}

//	static long base9(long n) {
//		if (n < 9) {
//			return n;
//		} else {
//			return (n % 9 + 10 * base9(n / 9));
//		}
//
//	}

	static long guess(long value) {
		long sum = 0;

		for (int i = 1; i <= value / 2; i++) {
			if (value % i == 0)
				sum += i;
		}
		return sum;
	}

}
