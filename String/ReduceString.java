package String;

import java.util.Scanner;

public class ReduceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			// int l = s.length();

			System.out.print(numSteps1(s) + "\n");
			// System.out.println(reduceString(s, l));

		}
	}

	static int reduceString(String s, int l) {
		if (s.length() > l)
			return -1;

		int count = 1, steps = 0;

		for (int i = 1; i < l; i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				count += 1;
			else {
				steps += (count / 2);
				count = 1;
			}
		}
		steps += count / 2;
		return steps;

	}

	public static int numSteps(String s) {
		int e = s.length() - 1;
		char[] c = s.toCharArray();
		int one = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '1') {
				one++;
			}
		}
		int count = 0;
		while (e > 0) {
			if (c[e] == '1') {
				int j = e;
				while (j >= 0 && c[j] == '1') {
					c[j] = '0';
					one--;
					j--;
				}
				if (j == -1) {
					count++;
				}
				if (j >= 0) {
					c[j] = '1';
				}
				one++;
			} else {
				e--;
			}
			count++;
		}
		return count;
	}

	static int numSteps1(String s) {
		int step = 0;
		int carry = 0;
		StringBuilder sb = new StringBuilder(s);
		for (int i = sb.length() - 1; i > 0; --i) {
			// if it is odd, add 1 with it and update step by 2
			// what makes it odd, when last digit is 1
			if (sb.charAt(i) - '0' + carry == 1) {
				carry = 1;
				step += 2;
			} else {
				step += 1;
			}
		}
		return step + carry;
	}

}
