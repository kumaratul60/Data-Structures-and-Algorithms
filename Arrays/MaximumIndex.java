package Arrays;

import java.util.Scanner;

public class MaximumIndex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new MaximumIndex();
		System.out.println(max(a, n));

	}

	static int max(int a[], int n) {
		int maxdiff = Integer.MIN_VALUE;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n-1; j++) {
//				if (a[j] >=a[i] && maxdiff < (j - i))
//					maxdiff = j - i;
//			}
//
//		}
		return maxdiff;
	}
	

		
}
