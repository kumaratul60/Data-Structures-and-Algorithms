package Searching;

import java.util.Scanner;

public class RepeatedElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int ele = twoRepeated(a, n);
			// System.out.println(ele);
			new RepeatedElement();
			RepeatedElement.twoRepeated(a, n);

		}

	}

	public static void twoRepeated(int arr[], int N) {

		// Your code here

		for (int i = 0; i < N; i++) {
			if (arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}

	}

}
