package String;

import java.util.Scanner;

public class First_NonRepeating_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int freq[] = new int[26];
			for (int i = 0; i < s.length(); i++)
				freq[s.charAt(i) - 97]++;
			for (int i = 0; i < s.length(); i++) {
				if (freq[s.charAt(i) - 97] == 1) {
					System.out.println(s.charAt(i));
					break;
				}
			}
		}

	}

}
