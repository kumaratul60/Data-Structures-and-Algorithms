package Sorting;

import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int pivot = sc.nextInt();
			new Partition();
			Partition.partition(a, pivot);
			//print(a, n);
		}
	}

	static void partition(int a[], int pivot) {
		// 0 to j-1 -> <=pivot
		// j to i-1 -> >pivot
		// i to end -> unknown
		int i = 0;
		int j = 0;
		while (i < a.length) {
			if (a[i] > pivot)
				i++;
			else {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;

			}
		}
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
