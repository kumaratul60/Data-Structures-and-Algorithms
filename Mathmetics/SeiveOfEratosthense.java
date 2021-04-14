package Mathmetics;

import java.util.Arrays;
import java.util.Scanner;

public class SeiveOfEratosthense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println("Enter the num :");
		while (t-- > 0) {

			int n = sc.nextInt();

			primeSeive1(n);
		}

	}

	static void primeSeive(int n) {
		int isPrime[] = new int[n + 1];

		// If prime[p] is not changed, then it is a prime
		for (int i = 2; i <= n; i++) {
			if (isPrime[i] == 0) {
				for (int j = 2 * i; j <= n; j += i) {
					isPrime[j] = 1;
				}
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (isPrime[i] == 0)
				System.out.print(i + " ");
		}
		System.out.println();

	}

	static void primeSeive1(int n) {
		boolean isPrime[] = new boolean[n + 1];

		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;

		// If prime[p] is not changed, then it is a prime
		for (int i = 2; i <= n; i++) {

			for (int j = 2 * i; j <= n; j += i) {
				isPrime[j] = false;
			}

		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (isPrime[i])
				System.out.print(i + " ");
		}
		System.out.println();
	}

}
