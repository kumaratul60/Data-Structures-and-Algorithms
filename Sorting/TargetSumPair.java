package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int x = sc.nextInt();

			targetSumPair(a, x);
		}
	}

	static void targetSumPair(int a[], int target) {
		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			if (a[low] + a[high] > target)
				high--;
			else if (a[low] + a[high] < target)
				low++;
			else {
				System.out.println(a[low] + " " + a[high]);
				low++;
				high--;

			}
		}
	}
}
