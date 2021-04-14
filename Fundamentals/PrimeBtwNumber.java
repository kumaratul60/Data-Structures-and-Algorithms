package Fundamentals;

import java.util.Scanner;

public class PrimeBtwNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			for (int i = n; i < m; i++) {
				int j;
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					}
				}
				if (j == i)
					System.out.print(j + " ");
			}

		}
	}

}
