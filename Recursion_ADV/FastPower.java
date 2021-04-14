package Recursion_ADV;

import java.util.Scanner;

public class FastPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int power = fPow2(n, m);
			System.out.println(power);
			

		}
	}

	static int fPow(int a, int b) {

		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return fPow(a * a, b / 2);
		else
			return a * fPow(a, b - 1);
	}

	static int fPow1(int a, int b) {

		if (b == 0)
			return 1;

		return a * fPow1(a, b - 1);
	}

	static int fPow2(int a, int b) {
		if (a == 0)
			return 1;
		if (b == 0)
			return a;

		int temp = fPow2(a, b / 2);
		if (b % 2 == 0)
			return temp * temp;
		return a * temp * temp;

	}

}
