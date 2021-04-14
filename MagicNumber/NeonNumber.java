package MagicNumber;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isNeon(n));
		}
	}

	static boolean isNeon(int n) {
		int sum = 0;
		int originalNum = n;
		int sq = n * n;
		while (sq > 0) {
			int lastDigit = sq % 10;

			sum += lastDigit;
			sq /= 10;
		}
		return (sum == originalNum);
	}

}
