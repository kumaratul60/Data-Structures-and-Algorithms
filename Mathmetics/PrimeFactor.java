package Mathmetics;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		//while (t-- > 0) {

			int n = sc.nextInt();
			primeFactor(n);
		//}

	}

	static void primeFactor(int n) {
		// spf = smallestPrimeFacor

		int spf[] = new int[n + 1];
		
		for (int i = 2; i * i <= n; i++) {
			spf[i] = i;
		}
		
		for (int i = 2; i * i <= n; i++) {
			if (spf[i] == i) {
				for (int j = 2 * i; j <= n; j += i) {
					if (spf[j] == j) {
						spf[j] = i; // update
					}
				}
			}
		}
		while (n != 1) {
			System.out.print(spf[n]+" ");
			n = n/spf[n];

		}
	}

}
