package Fundamentals;

import java.util.Scanner;

public class PerfectSqr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		if (isPerfectSqr(n))
			System.out.println("Yes");
		else
			System.out.println("NO");
	}

	static boolean isPerfectSqr(double n) {

		double dn = Math.sqrt(n);
		return ((dn - Math.floor(dn)) == 0);
	}

}
