package Recursion_ADV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PossibleWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new Phone();
			ArrayList<String> res = Phone.possibleWords(a, n);
			for (String i : res)
				System.out.print(i + " ");
			System.out.println();

		}
	}
}

class Phone {
	static String codes[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	static ArrayList<String> possibleWords(int a[], int n) {
		if (n == 0) {
			ArrayList<String> allwords = new ArrayList<>();
			allwords.add("");
			return allwords;
		}
		String code = codes[a[0]];
		int[] smallInput = Arrays.copyOfRange(a, 1, n);
		ArrayList<String> words = possibleWords(smallInput, n - 1);
		ArrayList<String> allwords = new ArrayList<>();
		for (int i = 0; i < code.length(); i++)
			for (String word : words)
				allwords.add(code.charAt(i) + word);

		return allwords;
	}

}
