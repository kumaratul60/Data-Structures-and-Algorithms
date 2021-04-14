package Fundamentals;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		new PerfectNum().print(n);

	}

	static boolean isPerfect(int n) {
		int sum = 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n)
					sum = sum + i + n / i;
				else
					sum += i;
			}
		}
		if (sum == n && n != 1)
			return true;
		else
			return false;
	}

	static void print(int n) {

		if (isPerfect(n))
			System.out.println("true");

		else
			System.out.println("false");

	}

}
