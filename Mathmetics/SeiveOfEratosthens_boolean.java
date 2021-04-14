package Mathmetics;

import java.util.Arrays;
import java.util.Scanner;

public class SeiveOfEratosthens_boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			boolean isPrime[] = seive(n);
			for (int i = 0; i < n; i++)
				System.out.println(i + " " + isPrime[i]);
		}
	}

	static boolean[] seive(int n) {

		boolean isPrime[] = new boolean[n + 1];

		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			for (int j = 2 * i; j <= n; j += i)

				isPrime[j] = false;
		}
		return isPrime;
	}

}
