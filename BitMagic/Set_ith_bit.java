package BitMagic;

import java.util.Scanner;

public class Set_ith_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // 309
			int i = sc.nextInt(); // 3
			System.out.println(setIth(n, i)); // 317

		}

	}

	static int setIth(int n, int k) {

		// mask = 1 << position
		// In general, (1 << k) | n.

		int mask = 1 << k;
		return n | mask;
	}

}
