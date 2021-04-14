package Recursiion;

import java.util.Scanner;

public class One_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			print1_n(n);
			printN_1(n);

		}

	}

	static void print1_n(int n) {
		if (n <= 1) {
			System.out.println(1);
			return;
		}

		print1_n(n - 1);
		System.out.println(n);
	}

	static void printN_1(int n) {
		if (n <= 1) {
			System.out.println(1);
			return;
		}
		System.out.print(n + " ");
		printN_1(n - 1);
	}

}
