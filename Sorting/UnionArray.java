package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int m = sc.nextInt();
			int b[] = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();

			new UnionArray();
			// UnionArray.printUnion(a, b, n, m);
			 UnionArray.printUnion1(a, b, n, m);
			//System.out.println(UnionArray.findUnion(a, b, n, m));

		}
	}

	static void printUnion(int a[], int b[], int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}
			if (j > 0 && b[j] == b[j - 1]) {
				j++;
				continue;
			}
			if (a[i] < b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (b[j] < a[i]) {
				System.out.print(b[j] + " ");
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		while (i < m) {
			if (i == 0 || a[i] != a[i - 1]) {
				System.out.print(a[i] + " ");
				i++;
			}
			while (j < n) {
				if (j == 0 || b[j] != b[j - 1]) {
					System.out.print(b[j] + " ");
					j++;
				}
			}
		}
	}

	static void printUnion1(int arr1[], int arr2[], int m, int n) {
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}

		/*
		 * Print remaining elements of the larger array
		 */
		while (i < m)
			System.out.print(arr1[i++] + " ");
		while (j < n)
			System.out.print(arr2[j++] + " ");
		// return 0;
	}

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		int i = 0, j = 0;
		// boolean flag = false;

		ArrayList<Integer> sb = new ArrayList<Integer>();
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {

				i++;
			} else if (arr2[j] < arr1[i]) {

				j++;
			} else {

				j++;
				i++;
			}
		}

		/*
		 * Print remaining elements of the larger array
		 */
		while (i < m) {
			i++;
		}
		while (j < n) {
			j++;
		}
//		if (flag == false) {
//			sb.add(-1);
//		}
		return sb;
	}

}
