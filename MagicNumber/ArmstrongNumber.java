package MagicNumber;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(armstrong(n));
		}
	}

	static boolean armstrong(int n) {
		int sum = 0;
		int originalNum = n;
		while (n > 0) {
			int lastDigit = n % 10;
			sum += Math.pow(lastDigit, 3);
			n /= 10;
		}
		if (sum == originalNum) {
			return true;
		}

		return false;
	}

}
