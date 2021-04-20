// A number is palindrome, if the reverse of the number is equal to the original number.

// 1234 ==> 4321  not a palindrome.
// 2002,12321 are palindrome.




package MagicNumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(palindrome(n));
		}
	}

	static boolean palindrome(int n) {
		int reverse = 0;
		int originalNum = n;
		while (n > 0) {
			int lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n /= 10;
		}
		if (reverse == originalNum) {
			return true;
		}
		return false;

	}

}
