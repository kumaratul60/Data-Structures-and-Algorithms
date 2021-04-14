package Fundamentals;

import java.util.Scanner;

public class LCM_GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			new LCM_GCD();

			System.out.println(LCM_GCD.lcmAndGcd(n, m));

		}
	}

	// helper method to get gcd of 2 numbers.
	static int gcd(int a, int b) {
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	static int[] lcmAndGcd(int A, int B) {

		int[] arr = new int[2];

		int g = gcd(A, B); // gcd of two numbers.
		int l = (A * B) / g; // product of 2 numbers divided by their gcd gives their lcm.

		arr[0] = l;
		arr[1] = g;

		return arr;
	}

//	// method to return LCM of two numbers
//	static int lcm(int a, int b) {
//		int p = (a / gcd(a, b)) * b;
//		return p;
//	}
//
//	// Recursive method to return gcd of a and b
//	static int gcd(int a, int b) {
//		if (a == 0)
//			return b;
//		return gcd(b % a, a);
//	}

}
