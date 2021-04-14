package Fundamentals;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// reverse of number
		int rev = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		System.out.println(rev);

		// sum of number
	
		int sum = 0;

		while (n != 0) {
			int lastDigit = n%10;
			sum += lastDigit;
			n /= 10;
		}
		System.out.println(sum);

	}

}
