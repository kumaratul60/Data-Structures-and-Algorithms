package Sorting;

import java.util.Scanner;

public class Closet_0s_1s_2s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new Closet_0s_1s_2s();
			Closet_0s_1s_2s.segregate(a, n);
			printArray(a, n);

		}
	}

	public static void segragate012(int a[], int n) {

		int low = 0;
		int high = n - 1;
		int mid = 0;
		int temp = 0;
		while (mid <= high) {
			switch (a[mid]) {
			case 0: {
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
				break;
			}
			}
		}
	}

	static void segregate(int a[], int n) {
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0)
				counter1++;
			if (a[i] == 1)
				counter2++;
			if (a[i] == 2)
				counter3++;

		}
		for (int i = 0; i < counter1; i++)
			a[i] = 0;
		for (int i = counter1; i < counter1 + counter2; i++)
			a[i] = 1;
		for (int i = counter1 + counter2; i < counter1 + counter2 + counter3; i++)
			a[i] = 2;
	}

	static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
