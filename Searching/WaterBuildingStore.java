package Searching;

import java.util.Scanner;

public class WaterBuildingStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
//			int max = maxWater1(a, n);
//			System.out.println(max);
			System.out.println(maxWater1(a, n));
		}
	}

	static int maxWater(int[] a, int n) {
		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int current = (Math.min(a[i], a[j]) * j - i - 1);
				max = Math.max(max, current);
			}
		}
		return max;

	}

	static int maxWater1(int a[], int n) {
		int max = 0;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			if (a[i] < a[j]) {
				max = Math.max(max, (j - i - 1) * a[i]);
				i++;
			} else if (a[i] > a[j]) {
				max = Math.max(max, (j - i - 1) * a[j]);
				j--;
			} else {
				max = Math.max(max, (j - i - 1) * a[i]);
				j--;
				i++;
			}
		}
		return max;
	}

}
