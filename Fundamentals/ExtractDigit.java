package Fundamentals;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(extract(n));
		}
	}

	static int extract(int n) {
		String string_number = Integer.toString(n);

		// Traversing through the string using for loop
		for (int i = 0; i < string_number.length(); i++) {

			// Printing the characters at each position
			System.out.println(string_number.charAt(i));
		}
		return 0;

	}

	static int extractDigit(int number) {
		// Printing the last digit of the number
		while (number > 0) {

			// Finding the remainder (Last Digit)
			int remainder = number % 10;

			// Printing the remainder/current last digit
			System.out.println(remainder);

			// Removing the last digit/current last digit
			number = number / 10;
		}
		return 0;
	}

}
