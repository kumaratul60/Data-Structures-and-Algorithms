package Recursion_ADV;

import java.util.Arrays;
import java.util.Scanner;

public class SubString_LexicoGrafic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(subString(s+"\n"));

	}

	static String subString(String s) {

		int n = s.length();

		// Creating an array to store substrings
		int sub_count = n * (n + 1) / 2;
		String[] arr = new String[sub_count];

		// finding all substrings of string
		int index = 0;
		for (int i = 0; i < n; i++)
			for (int len = 1; len <= n - i; len++) {
				arr[index++] = s.substring(i, i+len);
			}

		// Sort all substrings in lexicographic
		// order
		Arrays.sort(arr);

		// Concatenating all substrings
		String res = "";
		for (int i = 0; i < sub_count; i++)
			res += arr[i];

		return res;
	}

}
