package Recursiion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < n-1; i++)
				s[i] = sc.nextLine();

			int index = s.length - 1;
			ArrayList<ArrayList<String>> result = getSubset(s, index);
			System.out.println(result);
		}
	}

	static ArrayList<ArrayList<String>> getSubset(String[] set, int index) {
		ArrayList<ArrayList<String>> allSubsets;
		if (index < 0) {
			allSubsets = new ArrayList<ArrayList<String>>();
			allSubsets.add(new ArrayList<String>());
		}

		else {
			allSubsets = getSubset(set, index - 1);
			String item = set[index];
			ArrayList<ArrayList<String>> moreSubsets = new ArrayList<ArrayList<String>>();

			for (ArrayList<String> subset : allSubsets) {
				ArrayList<String> newSubset = new ArrayList<String>();
				newSubset.addAll(subset);
				newSubset.add(item);
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;
	}
}
