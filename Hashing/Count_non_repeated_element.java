package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_non_repeated_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println(countNonRepeated(a, n));

	}

	static long countNonRepeated(int a[], int n) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int key = a[i];
			if (hm.containsKey(key)) {
				int freq = hm.get(key);
				freq++;
				hm.put(key, freq);
			} else
				hm.put(key, 1);
		}
		long count = 0;

		// Now, iterate through the array elements
		// and check if frequency is 1, increment the counter
		for (int i = 0; i < n; i++) {
			if (hm.get(a[i]) == 1)
				count++;
		}
		return count;
	}

	static long countNonRepeated1(int a[], int n) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a)
			map.merge(i, 1, Integer::sum);
		long count = map.entrySet().stream().filter(e -> e.getValue() == 1).count();
		return count;
	}

}
