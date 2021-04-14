package Backtracking;

import java.util.ArrayList;

public class PartitionOfArray {

	public static void main(String[] args) {
		int a[] = { 2, 1, 2, 3, 4, 8 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		ArrayList<Integer> al = new ArrayList<>();
		// sum%2==0; === (sum&1) == 0;
		boolean isPossible = (sum & 1) == 0 && partition(a, sum / 2, 0, al);
		if (isPossible) {

			for (int e : al) {
				System.out.print(e + " ");
			}
		} else
			System.out.println("not possible");

	}

	static boolean partition(int a[], int sum, int idx, ArrayList<Integer> ans) {

		if (idx >= a.length || sum < 0)
			return false;

		if (sum == 0)
			return true;

		ans.add(a[idx]);
		boolean leftPossible = partition(a, sum - a[idx], idx + 1, ans);

		if (leftPossible)
			return true;

		ans.remove(ans.size() - 1);
		return partition(a, sum, idx + 1, ans);

	}

}
