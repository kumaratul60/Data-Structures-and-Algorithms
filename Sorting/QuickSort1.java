package Sorting;

import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int pivot = sc.nextInt();
//			new Partition();
//			Partition.partition(a, pivot);
			quickSort(a, 0, n - 1);
			print(a, n);
		}
	}

	static void quickSort(int a[], int low, int high) {
		if (low >= high)
			return;
		int pivot = a[high];
		int pi = partition(a, pivot, low, high);
		quickSort(a, low, pi - 1);
		quickSort(a, pi + 1, high);
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
