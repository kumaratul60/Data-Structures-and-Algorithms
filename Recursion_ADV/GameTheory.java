package Recursion_ADV;

import java.util.Scanner;

public class GameTheory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int print = coinMax(a, 0, a.length - 1);
			System.out.println(print);

		}
	}

	static int coinMax(int a[], int l, int r) {
		if (l + 1 == r)
			return Math.max(a[l], a[r]);

		return Math.max(a[l] + Math.min(coinMax(a, l + 1, r - 1), coinMax(a, l + 1, r - 1)),
				a[r] + Math.min(coinMax(a, l + 1, r - 1), coinMax(a, l, r - 2)));
	}

}
