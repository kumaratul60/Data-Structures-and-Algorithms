package Recursiion;

import java.util.Scanner;

public class FastPower {
	static int stepCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int power = fPow(n, m);
			System.out.println(power);
			System.out.println("steps " + stepCount);
		}
	}

	static int fPow(int a, int b) {
		stepCount++;
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return fPow(a * a, b / 2);
		else
			return a * fPow(a, b - 1);
	}

}
