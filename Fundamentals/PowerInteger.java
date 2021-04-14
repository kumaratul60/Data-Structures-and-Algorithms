package Fundamentals;

import java.util.Scanner;

public class PowerInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();

		double ans = 1.0;
		long ln = n;

		if (ln < 0)
			ln = -1 * ln;
		while (ln > 0) {
			if (ln % 2 == 1) {
				ans = ans * x;
				ln = ln - 1;
			} else {
				x = x * x;
				ln = ln / 2;

			}

		}
		if (n < 0)
			ans = (double) (1.0) / (double) (ans);
		System.out.println(ans);
	}

}
//logic :  when x^n [n=n%2==0] -> (x*x)(n%2)
// [n=n%2==1] -> (x*x)(n-1)
