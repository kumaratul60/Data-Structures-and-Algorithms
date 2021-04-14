package Searching;

import java.util.Scanner;

public class BitonicArray_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int res = checkBitonic(a, n);
			System.out.println(res == 1 ? "Yes" : "No");

		}
	}

	static int checkBitonic(int arr[], int n) {
		int i, j;

		// Check for increasing sequence
		for (i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				continue;

		//	if (arr[i] <= arr[i - 1])
			else
				break;
		}

		if (i == n - 1)
			return 1;

		// Check for decreasing sequence
		for (j = i + 1; j < n; j++) {
			if (arr[j] < arr[j - 1])
				continue;

			//if (arr[j] >= arr[j - 1])
			else
				break;
		}

		i = j;

		if (i != n)
			return 0;

		return 1;
	}

}
