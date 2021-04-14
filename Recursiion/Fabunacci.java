package Recursiion;

import java.util.Scanner;

public class Fabunacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int fib = fabu(n);
			System.out.println(fib);
			print(n);
		}
	}

	static int fabu(int n) {
		if (n <= 1)
			return n;
		return fabu(n - 1) + fabu(n - 2);
	}

	static void print(int n) {
		for (int i = 0; i < n; i++)
			System.out.print(fabu(i) + " ");
	}

}
