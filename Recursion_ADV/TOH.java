package Recursion_ADV;

import java.util.Scanner;

public class TOH {
	// static int stepCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			toh(n, 'A', 'C', 'B');
			System.out.println("steps " + stepCount);
			stepCount = 0;

		}
	}

	// A = source, B = Destiny, C = helper
	static int stepCount = 0;

	static void toh(int n, char A, char B, char C) {
		stepCount++;

		if (n == 1) {
			System.out.println("moving plate " + n + " from " + A + " to " + B);
			return;
		}
		toh(n - 1, A, C, B);
		System.out.println("moving plate " + n + " from " + A + " to " + B);
		toh(n - 1, C, B, A);

	}

}
