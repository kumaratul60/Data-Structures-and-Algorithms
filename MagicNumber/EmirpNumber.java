/*

An emirp number is a number which is prime from  backwards and forwards.

13 and 31 are both prime number, so this is emirp number.

*/


package MagicNumber;

import java.io.IOException;

public class EmirpNumber {

	public static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	// Function will check whether number
	// is Emirp or not
	public static boolean isEmirp(int n) {
		// Check if n is prime
		if (isPrime(n) == false)
			return false;

		// Find reverse of n
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n /= 10;
		}

		// If both Original and Reverse are Prime,
		// then it is an Emirp number
		return isPrime(rev);
	}

	// Driver Function
	public static void main(String args[]) throws IOException {
		int n = 13; // Input number
		if (isEmirp(n) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
