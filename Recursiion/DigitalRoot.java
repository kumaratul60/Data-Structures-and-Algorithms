package Recursiion;

import java.util.Scanner;

public class DigitalRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int s = sc.nextInt();
			System.out.println(digitalRoot(s));
		}
	}

	public static int digitalRoot(int n) {
		if (n < 10)
			return n;
		return digitalRoot(n % 10 + n / 10);
	}

	public static int digitalRoot1(int n) {
		if (n == 0)
			return 0;

		int x = n % 10 + digitalRoot(n / 10);
		int y = x % 10 + digitalRoot(x / 10);
		return y;
	}

	// function to calculate the single digit answer
	public static int digitalRoot2(int n) {
		// if n is less than n then  returning the n
		if (n / 10 == 0)
			return n;
		else    // else calling sumDigits function
			return digitalRoot(sumDigits(n));
	}

	// function to calculate digit sum  of a number
	static int sumDigits(int n) {
		// returning n if n / 10 is 0
		if (n / 10 == 0)
			return n;
		else		// else adding digit sum
			return n % 10 + sumDigits(n / 10);
	}
}
