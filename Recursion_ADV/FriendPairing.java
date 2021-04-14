package Recursion_ADV;

import java.util.Scanner;

public class FriendPairing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(frndPair(n));
		}
	}

	static int frndPair(int n) {
		if (n == 0 || n == 1 || n == 2)
			return n;
		return frndPair(n - 1) + frndPair(n - 2) * (n - 1);
	}

}
