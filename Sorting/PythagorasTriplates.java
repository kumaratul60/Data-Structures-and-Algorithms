package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class PythagorasTriplates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			boolean triplets = isTriplet(a, n);
			System.out.println(triplets);
		}
	}

	static boolean isTriplet(int a[], int n) {
		for (int i = 0; i < n; i++)
			a[i] = a[i] * a[i];

		Arrays.sort(a);

		for (int i = n - 1; i >= 2; i--) {
			int left = 0;
			int right = i - 1;
			while (left < right) {
				if (a[left] + a[right] < a[i])
					return true;
				else if (a[left] + a[right] > a[i])
					left++;
				else
					right--;
			}
		}
		return false;
	}

}
