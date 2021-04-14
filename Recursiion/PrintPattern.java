package Recursiion;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			ptrn(n);
			System.out.println();

		}
	}

	static void ptrn(int n) {
		if (n <= 0) {
			System.out.print(n + " ");
			return;
		}
		System.out.print(n + " ");
		ptrn(n - 5);
		if (n > 0)
			System.out.print(n + " ");

	}

}
