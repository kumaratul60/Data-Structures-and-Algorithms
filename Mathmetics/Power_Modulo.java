package Mathmetics;

import java.util.Scanner;

public class Power_Modulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();

//		power(a, b);
//		fastPower(a, b);
//		System.out.println(fastPower_Recur(a, b));
		System.out.println(modulo(3978432, 5, 1000000007));
	}

	static void power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++)

			result *= a;
		System.out.println(result);
	}

	static void fastPower(int a, int b) {
		int res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				res *= a;
			}
			a = a * a;
			b = b >> 1;

		}
		System.out.println(res);
	}

	static int fastPower_Recur(int a, int b) {
		if (b == 0)
			System.out.println(1);
		if ((b & 1) == 0)
			return fastPower_Recur(a * a, b / 2);
		else
			return a * fastPower_Recur(a, b - 1);

	}

	static long modulo(long a, long b, int n) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				res = (res % n * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;
		}
		return res;
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
