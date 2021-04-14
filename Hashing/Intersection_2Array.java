package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intersection_2Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();

		System.out.println(intersectionArray(a, b));

	}

	private static int intersectionArray(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;

		Set<Integer> hs = new HashSet<>();

		int freq = 0;
		for (int i = 0; i < n; i++)
			hs.add(a[i]);
		for (int i = 0; i < m; i++) {
			if (hs.contains(b[i]))
				freq++;
			hs.remove(b[i]);
		}
		return freq;

	}

	static int intersection(int a[], int b[]) {
		int n = a.length;
		int m = b.length;
		int res = 0;

		boolean flag = false;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i - 1; j++) {
				if (a[j] == a[i])
					flag = true;
				break;
			}
			if (flag == true) {
				continue;
			}
			for (int j = 0; j < m; j++)
				if (a[i] == b[j]) {
					res++;
					break;
				}
		}

		return res;
	}

}
