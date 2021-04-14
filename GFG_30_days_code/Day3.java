package GFG_30_days_code;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of size N, find the smallest positive integer value that 
//cannot be represented as sum of some elements from the array.

//array[] = {1, 10, 3, 11, 6, 15}  --> op= 2;
// a[] = 1,1,1  --> op: 4;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			long a[] = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(smallestpositive(a, n));
		}

	}

	static long smallestpositive(long[] a, int n) {

//		Arrays.sort(a);
//		long res = 1;
//		for (int i = 0; i < n && a[i] <= res; i++)
//			res += a[i];
//		return res;
		Arrays.sort(a);
		long res = 1;
		for (int i = 0; i < n; i++)
			if (a[i] <= res)
				res += a[i];
		return res;
	}

}
