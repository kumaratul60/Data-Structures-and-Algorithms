package Fundamentals;

import java.util.Scanner;

public class DigitFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int res = digit(n, d);
		System.out.println(res);

	}

	static int digit(int n, int d) {
		int count = 0;
		while (n > 0) {
			int dig = n % 10;
			n = n / 10;
			if (dig == d) {
				count++;
			}
		}

		return count;

	}

}
