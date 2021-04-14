package Searching;

import java.util.Scanner;

public class Median_TwoSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n1 = sc.nextInt();
			int a1[] = new int[n1];
			for (int i = 0; i < n1; i++)
				a1[i] = sc.nextInt();
			int n2 = sc.nextInt();
			int a2[] = new int[n2];
			for (int i = 0; i < n2; i++)
				a2[i] = sc.nextInt();
			double median = findMedian(a1, a2);
			int median1 = findMedian1(a1, n1, a2, n2);
			System.out.println(median1);

		}
	}

	static double findMedian(int a1[], int a2[]) {
		if (a1.length > a2.length)
			return findMedian(a1, a2);

		int x = a1.length;
		int y = a2.length;
		int low = 0;
		int high = x;
		while (low <= high) {
			int partitionX = (low + high) / 2;
			int partitionY = (x + y + 1) / 2 - partitionX;

			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a1[partitionX - 1];
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : a1[partitionX];

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : a2[partitionY - 1];

			// int minRightY = (partitionY==y)?Integer.MAX_VALUE:a2[partitionY];

			int minRightY;
			if (partitionY == y)
				minRightY = Integer.MAX_VALUE;
			else
				minRightY = a2[partitionY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if ((x + y) % 2 == 0)
					return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;

				else
					return (double) Math.max(maxLeftX, maxLeftY);
			}

			else if (maxLeftX > minRightY)
				high = partitionX - 1;

			else
				low = partitionX + 1;

		}
		return -1;
	}

	public static int findMedian1(int a[], int n, int b[], int m) {
		// Your code here
		if (n > m)
			return findMedian1(a, n, b, m);
		int low = 0;
		int high = n;
		while (low <= high) {
			int partitionX = (low + high) / 2;
			int partitionY = (n + m + 1) / 2 - partitionX;

			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a[partitionX - 1];
			int minRightX = (partitionX == n) ? Integer.MAX_VALUE : a[partitionX];

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b[partitionY - 1];
			int minRightY = (partitionY == m) ? Integer.MAX_VALUE : b[partitionY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if ((n + m) % 2 == 0)
					return ((int) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
				else
					return ((int) Math.max(maxLeftX, maxLeftY));
			} else if (maxLeftX > minRightY)
				high = partitionX - 1;
			else
				low = partitionX + 1;

		}
		return -1;
	}

}
