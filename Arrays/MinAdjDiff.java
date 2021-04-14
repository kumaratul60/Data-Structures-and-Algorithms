package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinAdjDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		new MinAdjDiff();
		System.out.println(MinAdjDiff.mindiff(a, n));

	}

	static int mindiff(int a[], int n) {
		Arrays.sort(a);
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {

//				if (Math.abs(a[i] - a[j] )< diff)
//					diff = Math.abs(a[i] - a[j]);
			
			int curr_diff = Math.abs(a[i] - a[i + 1]);
			diff = Math.min(diff, curr_diff);
			
			
		}
		return diff;
	}

}
