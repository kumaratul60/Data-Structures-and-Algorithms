package Fundamentals;

import java.util.Scanner;

public class Permutation_Optimize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		int nFact = fact(n);
		int rFact = fact(n - r);

		int nPr = nFact / rFact;
		// System.out.println(n + "P" + r + " = " + nPr);
		display(n, r, nPr);
	}

	static int fact(int x) {
		int rv = 1;
		for (int i = 1; i <= x; i++)
			rv = rv * i;
		return rv;
	}

	public static void display(int n, int r, int nPr) {
		System.out.println(n + "P" + r + " = " + nPr);
	}

}
