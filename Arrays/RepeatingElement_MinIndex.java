package Arrays;

import java.util.Scanner;

public class RepeatingElement_MinIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int minIdx = repeatingMinIdx(a, n);
			System.out.println(minIdx);
		}
	}

	static int repeatingMinIdx(int a[], int n) {

		int idx[] = new int[n];
		for (int i = 0; i < n; i++)
			idx[i] = -1;

		int minIdx = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (idx[a[i]] != -1)
				minIdx = Math.min(minIdx, idx[a[i]]);
			else
				idx[a[i]] = i;
		}
		if (minIdx == Integer.MAX_VALUE) {
			System.out.println(-1);

		} else {

			minIdx = minIdx + 1;
		}

		return minIdx;
	}

}
