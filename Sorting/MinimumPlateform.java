package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlateform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int[] b = new int[n];
			for (int i = 0; i < n; i++)
				b[i] = sc.nextInt();
			int res = findPlatform(a, b, n);
			System.out.println(res);
		}
	}

	static int findPlatform(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);

		int i = 1, j = 0, res = 1, curr = 1;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				curr++;
				i++;
			} else {
				curr--;
				j++;
			}
			res = Math.max(res, curr);
		}
		return res;
	}

}
