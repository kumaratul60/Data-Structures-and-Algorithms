package Sorting;

import java.util.Scanner;

public class MergeSortDepth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			new MergeSortDepth();
			MergeSortDepth.mergeSort(a, 0, n - 1);

		}
	}

	static int[] mergeSort(int a[], int left, int right) {
		if (left == right) {
			int[] baseArray = new int[1];
			baseArray[0] = a[left];
			return baseArray;
		}

		int mid = left + (right - left) / 2;
		int[] firstSortedHalf = mergeSort(a, left, mid);
		int[] SecondSortedHalf = mergeSort(a, mid + 1, right);
		int[] fullSortedArray = mergeTwoSortedArray(firstSortedHalf, SecondSortedHalf);

		return fullSortedArray;

	}

	static int[] mergeTwoSortedArray(int a[], int b[]) {
		int n = a.length;
		int m = b.length;
		printA(a);
		printB(b);
		int res[] = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < m) {
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}

	static void printA(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	static void printB(int b[]) {
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

}
