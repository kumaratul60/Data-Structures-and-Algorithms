package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ArrayList pass by reference

public class Subset2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			// subset(a, 0, "", true);

			Arrays.sort(a);
			List<List<Integer>> bigs = new ArrayList<List<Integer>>();
			subset(a, 0, bigs, new ArrayList<Integer>(), true);
			System.out.println(bigs);
		}
	}

	static void subset(int a[], int vidx, String ans, boolean flag) {
		if (vidx == a.length) {
			System.out.print(ans + " ");
			return;
		}

		if (flag == false) {
			subset(a, vidx + 1, ans, false);
		} else {

			subset(a, vidx + 1, ans + a[vidx], true); // include
			subset(a, vidx + 1, ans, false); // exclude
		}
	}

	static void subset(int a[], int vidx, List<List<Integer>> big, List<Integer> temp, boolean flag) {
		if (vidx == a.length) {
			big.add(new ArrayList<Integer>(temp));
			return;
		}

		if (flag == false && a[vidx] == a[vidx - 1]) {
			subset(a, vidx + 1, big, temp, false);// exclude
		} else {

			temp.add(a[vidx]);
			subset(a, vidx + 1, big, temp, true); // include
			temp.remove(temp.size() - 1);

			subset(a, vidx + 1, big, temp, false); // exclude

		}
	}

}
