package Searching;

import java.util.Scanner;

public class RepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int repeat = repeatingElement(a, n);
			new RepeatingElement();
			RepeatingElement.repeatingElement1(a, n);
		}

	}

	static int repeatingElement(int a[], int n) {
		int low = 0;
		int high = n - 1;
		if (low > high)
			return -1;
		int mid = low + (high - low) / 2;
		if (a[mid] != mid + 1) {
			if (mid > 0 && a[mid] == a[mid - 1])
				return mid;
			else if (mid < 0 && a[mid] == a[mid + 1])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	static void repeatingElement1(int a[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j])
					System.out.print(a[i] + " ");
			}
		}

	}
}
