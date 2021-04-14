package Hashing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Max_freq_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			System.out.println(maxFreqChar(str));
		}

	}

	private static char maxFreqChar(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else
				map.put(ch, 1);
		}

		Set<Character> keySet = map.keySet();
		int maxFreqChar = Integer.MIN_VALUE;
		char maxChar = ' ';
		for (char key : keySet) {
			if (map.get(key) > maxFreqChar) {
				maxFreqChar = map.get(key);
				maxChar = key;
			}
		}
		return maxChar;

	}

}
