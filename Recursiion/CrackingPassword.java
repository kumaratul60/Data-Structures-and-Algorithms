package Recursiion;

import java.util.Scanner;

public class CrackingPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			comb(n);
		}

	}

	static void comb(int n) {
		if (n == 0)
			return;
		comb(n - 1);
		System.out.println(n + " ");

	}

}

