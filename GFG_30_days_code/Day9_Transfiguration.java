package GFG_30_days_code;

import java.util.HashMap;
import java.util.Map;

// properly used of  hash map 

public class Day9_Transfiguration {

	public static void main(String[] args) {
		String A = "GEEKSFORGEEKS";
		String B = "FORGEEKSGEEKS";
		System.out.println(transfigure1(A, B));

	}

	static int transfigure(String A, String B) {
		// Your code goes here.

		int n = A.length();
		int m = B.length();
		if (n != m)
			return -1;
		int count = 0;
		int i, j;
		i = j = n - 1;

		int check = 0;
		for (char c : A.toCharArray())
			check += c;
		for (char c : B.toCharArray())
			check -= c;

		if (check != 0)
			return -1;
		while (i >= 0 && j >= 0) {
			if (A.charAt(i) != B.charAt(j)) {
				count++;
				i--;
			} else {
				i--;
				j--;
			}
		}
		return count;

	}

	static int transfigure1(String A, String B) {
		if (A.length() != B.length()) {
			return -1;
		}

		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		int n = A.length();
		for (int i = 0; i < n; i++) {
			if (m.containsKey(A.charAt(i)))
				m.put(A.charAt(i), m.get(A.charAt(i)) + 1);
			else
				m.put(A.charAt(i), 1);
		}

		for (int i = 0; i < n; i++) {
			if (m.containsKey(B.charAt(i)))
				m.put(B.charAt(i), m.get(B.charAt(i)) - 1);
		}

		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			if (entry.getValue() != 0)
				return -1;
		}

		int i = n - 1, j = n - 1;
		int res = 0;
		while (i >= 0 && j >= 0) {
			while (i >= 0 && A.charAt(i) != B.charAt(j)) {
				i--;
				res++;
			}

			i--;
			j--;
		}

		return res;
	}

}
