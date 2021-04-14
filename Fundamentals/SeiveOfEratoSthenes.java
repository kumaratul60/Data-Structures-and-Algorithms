package Fundamentals;

import java.util.Scanner;

public class SeiveOfEratoSthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeSeive(n);
	}

	static void primeSeive(int n) {
		int isPrime[] = new int[n + 1];

		isPrime[0] = 0;
		isPrime[1] = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = i * i; j <= n; j += i) {
				isPrime[j] = 1;
			}
		}

		for (int i = 0; i <= n; i++) {
			System.out.println(i + " " + isPrime[i]);

			System.out.println();
		}
	}

}
