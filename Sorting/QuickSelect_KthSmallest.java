package Sorting;

import java.util.Scanner;

public class QuickSelect_KthSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			quickSelect(a, 0, n-1 , k);
			print(a, n);
		}
	}

	static int quickSelect(int a[], int low, int high, int k) {
		int pivot = a[high];
		int pi = partition(a, pivot, low, high);
		if (k > pi)
			return quickSelect(a, 0, pi - 1, k);
		else if (k < pi)
			return quickSelect(a, low, pi + 1, k);
		else
			return pivot;
	}

	static int partition(int a[], int pivot, int low, int high) {

		int i = low;
		int j = high;
		while (i <= high) {
			if (a[i] <= pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			} else
				i++;

		}
		System.out.println("pivot index =>" + (j - 1));
		return (j - 1);
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		 System.out.println();

	}

}
