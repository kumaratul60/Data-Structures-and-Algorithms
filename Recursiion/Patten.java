package Recursiion;

import java.util.Scanner;

public class Patten {
	static void printNum(int n) {
		System.out.print(n + " ");
		if (n <= 0)
			return;

		printNum(n - 5);
		System.out.print(n + " "); // print pattern in reverse order
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			printNum(n);
			

		}

	}

}
