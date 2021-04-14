package Sorting;

import java.util.Scanner;

public class PivotSortedRotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int pi = findPivot(a);
			System.out.println(pi);

		}
	}

	static int findPivot(int a[]) {
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (a[mid] < a[high])
				high = mid;
			else
				low = mid + 1;
		}
		//return a[low];
		 return a[high];
	}

}
