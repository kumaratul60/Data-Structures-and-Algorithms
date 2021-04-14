package Fundamentals;

import java.util.Scanner;

//Narcissistic Number is a number that is the sum of its own digits each raised to the power of the number of digits
//An n-digit number that is the sum of the nth powers of its digits is called a n-narcissistic number.
public class Narcissistic_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			new Narcissistic_Number().print(n);
		}
	}

	// function to count digits
	int countDigit(int n) {
		if (n == 0)
			return 0;

		return 1 + countDigit(n / 10);
	}

	// Returns true if n is Narcissistic number
	boolean check(int n) {
		// count the number of digits
		int l = countDigit(n);
		int dup = n;
		int sum = 0;

		// calculates the sum of
		// digits raised to power
		while (dup > 0) {
			sum += Math.pow(dup % 10, l);
			dup /= 10;
		}

		return (n == sum);

	}

	void print(int n) {
		if (check(n))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
