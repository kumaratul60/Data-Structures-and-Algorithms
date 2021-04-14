package Sorting;

import java.util.Scanner;

public class BinaryArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			
			new BinaryArray();
			BinaryArray.binaryArray(a, n);
			
			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
	}

	static void binaryArray(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < 1) {
				System.out.print(count+" ");
				count++;
				int temp = count;
				count = a[i];
				a[i] = temp;
			}
		}

	}
}
