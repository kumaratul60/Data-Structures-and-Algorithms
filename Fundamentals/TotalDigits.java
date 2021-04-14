package Fundamentals;

import java.util.Scanner;

public class TotalDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(new TotalDigits().findDigit(n));

		}
	}

	static int findDigit(int n) {

//		if (n <= 1) {
//			return 1;
//		}
		// Changing number to String
//		String s = String.valueOf(n);

		// Changing number to String
//		return s.length() + findDigit(n - 1);

		// In the loop we are decreasing 0, 9, 99 ... from n till
		// ( n - i + 1 ) is greater than 0 and sum them to number_of_digits to get the
		// required sum

		int number_of_digits = 0;  
		for (int i = 1; i <= n; i *= 10)
			number_of_digits += (n - i + 1);

		return number_of_digits;
	}
}
