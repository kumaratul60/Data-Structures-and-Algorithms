package Searching;

import java.util.Scanner;

public class Mid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int index = mid(a);
			// System.out.println(index);
			new Mid();
			Mid.mid(a);
		}
	}

	static void mid(int a[]) {
		int low = 0;
		int high = a.length - 1;
		int mid = low + (high - low) / 2;
		for (int i = 0; i < a.length; i++) {
			a[i] = a[mid];
		}

		System.out.println(a[mid]);
		System.out.println(mid);

		// return a[mid];

		// return mid;
	}

}
