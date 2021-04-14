package Mathmetics;

import java.util.Scanner;

public class Palimdrom_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(palim(n));
		}

	}

	static boolean palim(int n) {
		int originalNum = n;
		// int temp = 0;
		int rev = 0;

		while (n != 0) {
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		return (rev == originalNum) ? true : false;

	}

}
