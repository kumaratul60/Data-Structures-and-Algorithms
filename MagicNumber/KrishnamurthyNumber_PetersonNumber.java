/*

A Krisnamurthy or Peterson number is a number whose sum of factorial of digits is equals to the number itself.

145 -> 1! + 4! + 5! = 1+24+120 = 145 is.

235 -> 2!+3!+5! = 2+6+120 = 128 is not.

*/


package MagicNumber;

import java.util.Scanner;

public class KrishnamurthyNumber_PetersonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isKrishnamurthyNum(n));

		}
	}

	static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);

	}

	static boolean isKrishnamurthyNum(int n) {
		int sum = 0;
		int temp = n;
		
		while (temp != 0) {
			int lastDigit = temp % 10;
			sum += fact(lastDigit);
			temp /= 10;
		}

		return (sum == n);

	}

}
