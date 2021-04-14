package Recursiion;

import java.util.Scanner;

public class Power {
	
	static int stepCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int power = pow(n, m);
			System.out.println(power);
			System.out.println("steps " + stepCount);
			stepCount=0;
		}
	}

	static int pow(int a, int b) {
		stepCount++;
		if (b == 0)
			return 1;
		return a * pow(a, b - 1);
	}

}
