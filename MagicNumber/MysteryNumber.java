package MagicNumber;

import java.util.Scanner;

public class MysteryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isMystery(n));
		}
	}

	static boolean isMystery(int n) {
		for (int i = 1; i <= n / 2; i++) {
			int j = reverseDigit(i);
			if (i + j == n) {
				System.out.println(i + " " + j);
				return true;
			}
		}
		return false;
	}

	static int reverseDigit(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

}
