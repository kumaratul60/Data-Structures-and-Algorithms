package Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Zero_Sum_triplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new Zero_Sum_triplets();
			// Zero_Sum_triplets.findSum(a, n);
			// Zero_Sum_triplets.find_Triplets(a, n);
			System.out.println(Zero_Sum_triplets.findTriplet(a, n));

		}
	}

	static void findSum(int a[], int n) {
		Arrays.sort(a);
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {

				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						System.out.println();
					}
				}
			}
		}

	}

	static void findTriplets(int arr[], int n) {
		boolean found = false;

		for (int i = 0; i < n - 1; i++) {
			// Find all pairs with sum equals to
			// "-arr[i]"
			HashSet<Integer> s = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int x = -(arr[i] + arr[j]);
				if (s.contains(x)) {
					System.out.printf(" %d %d %d\n", x, arr[i], arr[j]);
					found = true;
				} else {
					s.add(arr[j]);
				}
			}
		}

		if (found == false) {
			System.out.printf(" No Triplet Found\n");
		}
	}

	static void find_Triplets(int a[], int n) {
		boolean found = false;
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {
			int l = i + 1;
			int r = n - 1;
			int x = a[i];
			while (l < r) {
				if (x + a[l] + a[r] == 0) {
					System.out.print(x + " " + a[l] + " " + a[r] + "\n");
					l++;
					r--;
					found = true;
				} else if (x + a[l] + a[r] < 0)
					l++;
				else
					r--;
			}
		}
		if (found == false)
			System.out.println("No triplet found");

	}

	public static boolean findTriplet(int a[], int n) {
		boolean isTriplets = false;
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {
			int l = i + 1;
			int r = n - 1;
			int x = a[i];
			while (l < r) {
				if (x + a[l] + a[r] == 0) {
					isTriplets = true;
					l++;
					r--;

				} else if (x + a[l] + a[r] < 0)
					l++;
				else
					r--;
			}
		}
		if (isTriplets == false)
			return false;
		//return true;
		return isTriplets;
	}

}
