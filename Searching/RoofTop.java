package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class RoofTop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int max = maxStep(a, n);
			System.out.println(max);
		}
	}

	static int maxStep(int a[], int n) {
		int count = 0;
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i - 1])
				count++;
			else {
				max = Math.max(max, count);
				count = 0;
			}
		}

		return Math.max(count, max);
	}

}
