package Fundamentals;

import java.util.Scanner;

public class SumDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {

			int n = sc.nextInt();
			System.out.println(new SumDigit().sum(n));
			System.out.println(new SumDigit().count(n));
		}

	}

	int sum(int n) {
		if (n < 10)
			return n;
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	int count(int n) {
		if (n < 10)
			System.out.println(1);
		int count = 0;
		while (n != 0) {
			n /= 10;
			++count;
		}
		return count;
	}

}
