package Recursiion;

import java.util.Scanner;

public class Count_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			System.out.println(countChar(s, 0));

		}

	}

	static int countChar(String s, int n) {
		if (n == 0)
			return 0;
		if (n - 1 == 'a')
			return 1 + countChar(s, n - 1);
		return countChar(s, n - 1);

	}

}
