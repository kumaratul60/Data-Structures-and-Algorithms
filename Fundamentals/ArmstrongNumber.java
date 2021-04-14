package Fundamentals;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int sum = 0;
			int x = n;
			while (n > 0) {
				int lastDigit = n % 10;
				sum += (int) Math.pow(lastDigit, 3);
				n /= 10;

			}
//		if (sum == x)
//			System.out.println("yes");
//		else
//			System.out.println("No");
			System.out.println(sum == x ? "yes" : "no");
		}
	}

}
