package Fundamentals;

import java.util.Scanner;

public class divisibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			if (allDigitsDivide(n))
				System.out.println("Yes");

			else
				System.out.println("No");
		}
	}

	static boolean checkDivisibility(int n, int digit) {
		// If the digit divides the number
		// then return true else return false.
		return (digit != 0 && n % digit == 0);
	}

// Function to check if all 
// digits of n divide it or not, 
	static boolean allDigitsDivide(int n) {
		int temp = n;
		while (temp > 0) {

			// Taking the digit of the
			// number into var 'digit'.
			int digit = n % 10;

			if ((checkDivisibility(n, digit)) == false)
				return false;

			temp /= 10;
		}
		return true;
	}
}
