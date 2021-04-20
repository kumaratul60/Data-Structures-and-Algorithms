//A neaon number has sum of digits of square of number equal to the origit number.
	
// 9*9 = 81 => 8+1 = 9 is a neon number
// 12*12 = 1+4+4 = 9  not a neon number	

package MagicNumber;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isNeon(n));
		}
	}

	static boolean isNeon(int n) {
		int sum = 0;
		int originalNum = n;
		int sq = n * n;
		while (sq > 0) {
			int lastDigit = sq % 10;

			sum += lastDigit;
			sq /= 10;
		}
		return (sum == originalNum);
	}

}
