package Arrays;

import java.util.Scanner;

public class Largest_All {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		largest(a, n);
		secondlargest(a, n);
		largest3rd(a, n);

	}

	static void largest(int a[], int n) {
		int max = -1;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
			idx = i;
		}
		System.out.println("max element is: " + max + ", index is:" + idx);
	}

	static void secondlargest(int a[], int n) {
		int first, second;
		first = second = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] > second) {
				second = a[i];
			}
		}
		System.out.println("First highest: " + first);
		System.out.println("Second highest: " + second);

	}

	static void largest3rd(int a[], int n) {

		int first, second, third;
		first = second = third = -1;

		for (int i = 0; i < n; i++) {
			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];
			} else if (a[i] > second) {
				third = second;
				second = a[i];

			} else if (a[i] > third)
				third = a[i];
		}
		System.out.println("First highest: " + first);
		System.out.println("Second highest: " + second);
		System.out.println("Third highest: " + third);
	}

}
