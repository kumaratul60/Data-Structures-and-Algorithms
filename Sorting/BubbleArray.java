package Sorting;

import java.util.Scanner;

public class BubbleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int sort[] = bubble1(a);
			for (int i : sort)
				System.out.println(i);
		}

	}

	static void bubble(int a[], int n) {

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}

		}
	}

	static int[] bubble1(int a[]) {
		bubble(a, 0);
		int res[] = new int[a.length];
		return res;

	}
}
