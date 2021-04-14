package Recursion_ADV;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			coin(n, "");
		}
	}

	static void coin(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;

		}
		coin(n - 1, ans + "H");
		coin(n - 1, ans + "T");

	}

}
