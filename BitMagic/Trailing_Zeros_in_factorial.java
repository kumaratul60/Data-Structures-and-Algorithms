package BitMagic;

import java.util.Scanner;

public class Trailing_Zeros_in_factorial {

	public static void main(String[] args) {

		// Trailing 0s in n! = Count of 5s in prime factors of n!
		// = floor(n/5) + floor(n/25) + floor(n/125) + ....

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(traing0sFactorial(n));
		}
	}

	static int traing0sFactorial(int n) {
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;
		return count;
	}

}
