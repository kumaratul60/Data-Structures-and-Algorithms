package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			frequencyCount1(a, n);
		}
	}

	public static void frequencyCount(int a[], int n) {

		for (int i = 0; i < n; i++)
			a[i] = a[i] - 1;

		for (int i = 0; i < n; i++)
			a[a[i] % n] = a[a[i] % n] + n;

		for (int i = 0; i < n; ++i)
			// System.out.println(i + 1 + "->" + a[i] / n);
			System.out.print(a[i] / n + " ");

	}

	public static void frequencyCount1(int a[], int n) {
		int helper[] = new int[n];
		Arrays.fill(helper, 0);
		for (int i = 0; i < n; i++) {
			helper[a[i] - 1]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(helper[i] + " ");
		}
		System.out.print(sb);
	}

}
