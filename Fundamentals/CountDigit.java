package Fundamentals;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			// long n = sc.nextLong();
			int n = sc.nextInt();

			new CountDigit();
			// System.out.println((int) Math.floor(Math.log10(n) + 1));
			// System.out.println(CountDigit.countDigit(n));
			System.out.println(CountDigit.totalDigits(n));
		}
	}

//		static int countDigit(long n) 
//	    { 
//	        if (n == 0) 
//	            return 0; 
//	        return 1 + countDigit(n / 10); 
//	    } 
	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	static int findDigits(int n) {
		if (n == 1) {
			return 1;
		}
		// Changing number to String
		String s = String.valueOf(n);

		// add length of number to total_sum
		return s.length() + findDigits(n - 1);
	}

	static int totalDigits(int n) {
		int digits = 0;

		for (int i = 1; i <= n; i *= 10)
			digits += n - i + 1;
		return digits;
	}

}
