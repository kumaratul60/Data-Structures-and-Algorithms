package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int index = search(a, n, x);
			System.out.println(index);
		}

	}

	static int search(int a[], int n, int x) {
		int low = 0;
		int high = n - 1;
		Arrays.sort(a);
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
