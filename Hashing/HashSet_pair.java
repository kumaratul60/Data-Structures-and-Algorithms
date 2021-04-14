package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet_pair {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int sum = sc.nextInt();

		System.out.println(sumExists_2(a, n, sum));

	}

	public static int sumExists_1(int a[], int n, int sum) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < n; i++) {

			int temp = sum - a[i];

			if (hs.contains(temp))
				return 1;
			hs.add(a[i]);

		}
		return 0;
	}

	public static int sumExists_2(int a[], int n, int sum) {
		Set<Integer> hs = new HashSet<>();

		for (int i = 0; i < n; i++) {

			int temp = sum - a[i];

			if (temp >= 0 && hs.contains(temp))
				return 1;
			hs.add(a[i]);

		}
		return 0;
	}

}
