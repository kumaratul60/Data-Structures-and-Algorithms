package MagicNumber;

import java.util.Scanner;

public class AmicableNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(isAmicable(n, m));
		}

	}

	static int sumOfDivisors(int x) {
		int sum = 1;
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				sum += i;
				// to handle perfect squares
				if (x / i != i)
					sum += x / i;
			}
		}
		return sum;
	}

	static boolean isAmicable(int a, int b) {
		return (sumOfDivisors(a) == b && sumOfDivisors(b) == a);

	}

}
