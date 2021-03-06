package Recursiion;

import java.util.Scanner;

public class Binary {
	static void printBinary(int a[], int k, int n) {
		if (k == n) {
			for (int i = 0; i < n; i++)
				System.out.print(a[i]);
			System.out.println();
			return;
		}
		if (a[k - 1] == 0) {
			a[k] = 0;
			printBinary(a, k+1, n);
			a[k] = 1;
			printBinary(a, k+1, n);
		} else {
			a[k] = 0;
			printBinary(a, k+1, n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			a[0] = 0;
			printBinary(a,1,n);
			a[0] = 1;
			printBinary(a,1,n);
		}
	}

}
