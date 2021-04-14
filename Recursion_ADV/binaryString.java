package Recursion_ADV;

import java.util.Scanner;

public class binaryString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(count(n));

		}

	}

	static int count(int n) {
		if (n == 1)
			return 2;
		if (n == 2)
			return 3;

		return count(n - 1) + count(n - 2);
	}

	static int count(String s, int n) {
		if (n == 1)
			return 2;
		if (n == 2)
			return 3;

		return count(n - 1) + count(n - 2);
	}

}
