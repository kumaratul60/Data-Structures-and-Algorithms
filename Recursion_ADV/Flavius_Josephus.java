package Recursion_ADV;

import java.util.Scanner;

public class Flavius_Josephus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(myJos(n, k));

			System.out.println(jos(n, k) + 1);

		}
	}

	static int jos(int n, int k) {
		if (n == 1)
			return 0;

		return (jos(n - 1, k) + k) % n;
	}

	static int myJos(int n, int k) {
		return jos(n, k) + 1;
	}

/////////////////////////////////////////////////////////////////////
	// not recommended

	static int josephus(int n, int k) {
		if (n == 1)
			return 0;
		int x = josephus(n - 1, k);
		int y = (x + k) % n;

		return y;
	}
}
