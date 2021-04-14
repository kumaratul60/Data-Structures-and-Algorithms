package Backtracking;

import java.util.*;
import java.util.Scanner;


public class SubSet1_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			
			List<List<Integer>> biggs = new ArrayList<List<Integer>>();
			subSet(a, 0, new ArrayList<Integer>(), biggs);
			System.out.print(biggs + " ");
		}

	}
	
	static void subSet(int a[], int vidx, List<Integer> temp, List<List<Integer>> big) {

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
