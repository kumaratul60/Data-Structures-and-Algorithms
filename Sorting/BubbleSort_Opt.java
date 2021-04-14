package Sorting;

import java.util.Scanner;

public class BubbleSort_Opt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new BubbleSort_Opt();
			BubbleSort_Opt.bubbleSort(a, n);
			BubbleSort_Opt.print(a, n);

		}

	}

	static void bubbleSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++)
			bubble(arr, i, n);
	}

	static void bubble(int a[], int i, int n) {
		// iterate over elements
		for (int j = 0; j < n - i - 1; j++) {
			if (a[j] > a[j + 1]) {
				// swap the elements to get into correct position
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
	
}
