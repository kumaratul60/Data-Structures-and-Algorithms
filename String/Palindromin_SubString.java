package String;

import java.util.Scanner;

public class Palindromin_SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String s = sc.next();
			System.out.println(countPalindromic(s));

			// acbbca -> a,c,b,b,c,a,bb,cbbc,acbca
		}
	}

	static int countPalindromic(String str) {

		// O(1)
		int count = 0;

		// odd palindromic

		// O(n2)
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; (axis - orbit >= 0) && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		// even palindromic

		// O(n2)
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; (axis - orbit >= 0) && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}

		}

		// O(1)
		return count;
	}

	// 1+n^2+n^2+1
	// 2+2(n^2)
	// O(n^2)
}
