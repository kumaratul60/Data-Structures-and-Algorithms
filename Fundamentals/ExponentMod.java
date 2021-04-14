package Fundamentals;

import java.util.Scanner;

public class ExponentMod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(expMod(a, b, c));
		}

	}

	static int expMod(int a, int b, int c) {
		if (a == 0)
			return 0;
		if (b == 0)
			return 1;

		long y;
		if (b % 2 == 0) {
			y = expMod(a, b / 2, c);
			y = (y * y) % c;
		} else {
			y = a % c;
			y = (y * expMod(a, b - 1, c) % c) % c;
		}

		return (int) (y + c) % c;

	}

}
