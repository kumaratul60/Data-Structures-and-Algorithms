package Recursion_ADV;

import java.util.Scanner;

public class Pattern_N_rows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			printRow2(n, 0);
			// printRow2(n);

		}
	}

	// m1
	static void printRow(int n) {
		if (n == 0)
			return;

		for (int i = 1; i <= n; i++) {
			System.out.print("* ");
		}
		System.out.println();
		printRow(n - 1);
	}

	// m2
	static void printRow(int n, int i) {
		if (n == 0)
			return;

		if (i < n) {
			System.out.print("* ");
			printRow(n, i + 1);
		} else {
			System.out.println();
			printRow(n - 1, 0);
		}
	}

	// m3
	static void printRow1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i+1; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void printRow2(int n) {
		if (n == 0)
			return;

		printRow2(n - 1);
		for (int i = 1; i <= n; i++) {
			System.out.print("* ");
		} 
		System.out.println();
	}

	static void printRow2(int n, int i) {
		if (n == 0)
			return;
		if (i < n) {
			printRow2(n, i + 1);
			System.out.print("* ");
			
		} else {
			printRow2(n - 1, 0);
			System.out.println();
			
		}

	}

}
