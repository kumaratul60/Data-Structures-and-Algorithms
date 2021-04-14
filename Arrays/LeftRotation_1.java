package Arrays;

import java.util.Scanner;

public class LeftRotation_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			rotate1(a, n);
			print(a, n);
		}
	}

	static void rotate(int a[], int n) {
		int temp = a[0];
		for (int i = 1; i < n; i++) {

			a[i - 1] = a[i];
			a[i] = temp;
		}
	}

	static void rotate1(int a[], int n) {
		int temp = a[0];
		for (int i = 1; i < n; i++) {

			a[i - 1] = a[i];
		}
		a[n - 1] = temp;
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
