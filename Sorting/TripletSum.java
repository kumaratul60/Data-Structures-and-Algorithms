package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new TripletSum();
			System.out.println(TripletSum.find3Numbers(a, n, x));
			// System.out.println(num);
		}
	}

	public static int find3Numbers(int a[], int n, int x) {
		//boolean found = false;

		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int k = n - 1;

			// int s = x - a[i];
			while (j < k) {
				if (a[i] + a[j] + a[k] == x) {

					//found = true;
					return 1;
				}

				else if (a[i] + a[j] + a[k] < x)
					j++;
				else
					k--;
			}

		}
//		if (found == false)
//			return false;

		return 0;

	}

}
