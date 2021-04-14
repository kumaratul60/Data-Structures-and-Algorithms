package Recursion_ADV;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllPermutationsString_Backtracking {
	
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String s = sc.next();

			permutations(s, 0, s.length() - 1);

		}
	}

	static void permutations(String s, int l, int r) {

		if (l == r) {

			if (set.contains(s))
				return;
			set.add(s);

			System.out.println(s);
			return;
		}
		for (int i = l; i <= r; i++) {
			s = interChangeChar(s, l, i);
			permutations(s, l + 1, r);
			s = interChangeChar(s, l, i);
		}
	}

	static String interChangeChar(String s, int a, int b) {
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
}
