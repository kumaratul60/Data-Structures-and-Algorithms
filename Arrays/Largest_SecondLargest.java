package Arrays;

import java.util.Scanner;

public class Largest_SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		new Largest_SecondLargest().print(a, n);
	}

	void print(int a[], int n) {

		int i, max, secondMax, min, secondMin;
		max = secondMax = Integer.MIN_VALUE;
		min = secondMin = Integer.MAX_VALUE;
		if (n < 2) {
			System.out.println("invalid input");
			return;
		}

		for (i = 0; i < n; i++) {
			if (a[i] < min) {
				secondMin = min;
				min = a[i];

			} else if (a[i] < secondMin && a[i] != min)
				secondMin = a[i];
		}
		System.out.println("Min " + min);
		if (secondMin == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println("SecondMin = " + secondMin);

		for (i = 0; i < n; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];

			} else if (a[i] > secondMax && a[i] != max)
				secondMax = a[i];
		}
		System.out.println("Max " + max);
		if (secondMax == Integer.MIN_VALUE)
			System.out.println(-1);
		else
			System.out.println("SecondMax = " + secondMax);

	}

}
