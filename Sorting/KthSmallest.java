package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int kth = kthSmallest(a, 0, n - 1, k);
			System.out.println(kth);
//			int kths = kth_largest(a, k);
//			System.out.println(kths);
		}

	}

	static int kth_Smallest(int a[], int k) {

		Arrays.sort(a);
		return a[k - 1];

	}

	static int kth_largest(int a[], int k) {

		Arrays.sort(a);
		// return a[k + 1];
		return a[a.length - k];
	}

	static int kthSmallest(int a[], int left, int right, int k) {
		if (k > 0 && k <= right - left + 1) {
			int index = partition(a, left, right);
			if (index - 1 == k - 1)
				return a[index];
			if (index - 1 > k - 1)
				return kthSmallest(a, left, index - 1, k);
			if (index - 1 < k - 1)
				return kthSmallest(a, index + 1, right, k - index - 1 + left);
		}
		return -1;
	}

	static int partition(int a[], int left, int right) {
		int tem = a[right];
		int i = left;
		for (int j = left; j <= right - 1; j++) {
			if (a[j] <= tem) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
			int temp = a[i];
			a[i] = a[right];
			a[right] = temp;

		}
		return -1;
	}

}
