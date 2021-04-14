package Recursiion;

import java.util.Scanner;

public class TOH {
	static int stepCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			toh(n, 'A', 'B', 'C');
			System.out.println("steps " + stepCount);

		}
	}

	static void toh(int n, char A, char B, char C) {
		stepCount++;

		if (n == 1) {
			System.out.println("moving plate " + n + " from " + A + " to " + C);
			return;
		}
		toh(n - 1, A, B, C);
		System.out.println("moving plate " + n + " from " + A + " to " + C);
		toh(n - 1, B, C, A);

		return;

	}

}
