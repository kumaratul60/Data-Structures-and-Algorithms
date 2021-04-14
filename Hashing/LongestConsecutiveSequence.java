package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] a = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 4 };
		// [1,2,3,4,5,6]
		// [8,9,10,11,12]
		// [16]
		// [20]
		// [25]

		System.out.println(LCS(a));

	}

	private static ArrayList<Integer> LCS(int[] a) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		// storing all the start of the sequence
		for (int i = 0; i < a.length; i++) {

			// checking if n-1, is present in the hashMap
			// if it does,it mean the current element cannot be a start of the hashmap

			int nm1 = a[i] - 1;
			if (map.containsKey(nm1)) {
				map.put(a[i], false);
			} else
				map.put(a[i], true);

			// if the current no. is a start of a sequnce then n+1 cannot be a start of the
			// sequnce

			int np1 = a[i] + 1;
			if (map.containsKey(np1)) {
				map.put(np1, false);
			}
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());

		int maxLength = Integer.MIN_VALUE;
		int maxStartNo = 0;

		for (int key : keys) {

			if (map.get(key) == true) {

				int pStartNo = key;
				int count = 0;
				while (map.containsKey(pStartNo + count)) {
					count++;
				}

				if (count > maxLength) {
					maxLength = count;
					maxStartNo = pStartNo;
				}
			}
		}

		ArrayList<Integer> mr = new ArrayList<>();
		for (int i = 0; i < maxLength; i++) {
			mr.add(maxStartNo + i);
		}
		return mr;
	}

}
