package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset1_ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			// subSet(a, 0, "");

			ArrayList<ArrayList<Integer>> biggs = new ArrayList<ArrayList<Integer>>();
			subSet(a, 0, new ArrayList<Integer>(), biggs);
			System.out.print(biggs + " ");
		}

	}

	static void subSet(int a[], int vidx, String ans) {
		if (vidx == a.length) {
			System.out.print(ans + " ");
			return;
		}

		subSet(a, vidx + 1, ans); // exclude
		subSet(a, vidx + 1, ans + a[vidx]); // include

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void subSet(int a[], int vidx, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> big) {

		if (vidx == a.length) {
			big.add(new ArrayList<Integer>(temp));
			return;
		}

		temp.add(a[vidx]);
		subSet(a, vidx + 1, temp, big); // include
		temp.remove(temp.size() - 1);

		subSet(a, vidx + 1, temp, big); // exclude
	}

}
