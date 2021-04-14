package GFG_30_days_code;

import java.util.Scanner;

public class RearrangeGeek_and_his_Classmates {

	public static void main(String[] args) {
		
		//ip = 0 5 1 2 4 3
		//op = 0 3 5 1 4 2

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			long a[] = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			prank(a, n);
		}

	}

	static void prank(long a[], int n) {

		long idx[] = new long[n];

		for (int i = 0; i < n; i++) {
			idx[i] = a[(int) a[i]];
//		for (int i = 0; i < n; i++) {
//			a[i] = idx[i];
//			System.out.print(a[i] + " ");

			System.out.print(idx[i] + " ");
		}

	}

}
