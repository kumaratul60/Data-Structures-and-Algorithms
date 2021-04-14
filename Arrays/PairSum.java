package Arrays;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			boolean subA;
			subA = pairSum1(a, n, k);
			System.out.println(subA);
		}
	}

	static boolean pairSum(int a[], int n, int k) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] + a[j] == k) {
					System.out.println(i + " " + j);
					return true;
				}
			}
		}
		return false;
	}

	static boolean pairSum1(int a[], int n, int k) {
		int low = 0;
		int high = n - 1;
		while (low < high) {
			if (a[low] + a[high] == k) {
				System.out.println(low + " " + high);
				return true;
			} else if (a[low] + a[high] > k)
				high--;
			else
				low++;
		}

		return false;
	}

}
