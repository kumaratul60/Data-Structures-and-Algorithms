package Recursion_ADV;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			facto(n);
		}
	}

	static void facto(int n) {
		if (n == 0) {
			System.out.println(0);
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				int temp = i;

				n /= i;
//				if (n % temp == 0) {
//					
//					n /= temp;
//
//				}
			}
		}
	}

}
