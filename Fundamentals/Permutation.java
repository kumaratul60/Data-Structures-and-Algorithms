package Fundamentals;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		int nFact = 1;
		for (int i = 1; i <= n; i++)
			nFact *= i;

		int rFact = 1;
		for (int i = 1; i <= n; i++)
			rFact *= i;

		int nPr = nFact / rFact;
		System.out.println(n + "P" + r + " = " + nPr);
	}

}
