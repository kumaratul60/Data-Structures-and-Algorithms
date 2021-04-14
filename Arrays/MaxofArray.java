package Arrays;

import java.util.Scanner;

public class MaxofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		// new MaxofArray();
		// int max = maxArray(a, 0);
		int max = max(a, n);
		System.out.println(max);
		}

	}

	static int maxArray(int a[], int idx) {
		if (idx == a.length - 1)
			return a[idx];
		// misa = maxInSmallerArray
		int misa = maxArray(a, idx + 1);
		if (misa > a[idx])
			return misa;
		else
			return a[idx];
	}

	static int max(int a[], int n) {
		int max = -1;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
		}
		return max;
	}

}
