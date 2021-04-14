package Searching;

import java.util.Scanner;

public class Transpoint1Occ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int index = findOnes(a, 0, n - 1);
			System.out.println(index);
			
		//	System.out.println(new Transpoint1Occ().findOnes(a, 0, n - 1));

		}
	}

	static int findOnes(int a[], int low, int high) {
		if (low > high)
			return -1;
		int mid = low + (high - low) / 2;
		if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0))
			return mid;
		else if (a[mid] == 0)
			return findOnes(a, mid + 1, high);
		else
			return findOnes(a, low, mid - 1);

	}

}
