package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Print_Count_non_repeated_element {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String str[] = bf.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int a[] = new int[n];

			str = bf.readLine().trim().split(" ");
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(str[i]);

			ArrayList<Integer> v = printNonRepeated1(a, n);

			for (int i = 0; i < n; i++) {
				System.out.println(v.get(i) + " ");
			}
			System.out.println();
		}

	}

	// printing
	static ArrayList<Integer> printNonRepeated(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr)
			map.merge(i, 1, Integer::sum);
		map.entrySet().removeIf(e -> e.getValue() != 1);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr)
			if (map.containsKey(i))
				list.add(i);
		return list;

	}

	// printing
	static ArrayList<Integer> printNonRepeated1(int a[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			// int key = a[i];
			if (map.containsKey(a[i])) {
				int freq = map.get(a[i]);
				freq++;
				map.put(a[i], freq);
			}
			map.put(a[i], 1);
		}
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (map.get(a[i]) == 1)
				al.add(a[i]);
		}
		return al;
	}

}
