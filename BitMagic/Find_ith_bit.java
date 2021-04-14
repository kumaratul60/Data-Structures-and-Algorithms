package BitMagic;

import java.util.Scanner;

public class Find_ith_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // 309
			int i = sc.nextInt(); // 5
			System.out.println(ithBitSet(n, i)); // 1
			System.out.println(ithBit(n, i));	// 32
		}
	}

	static int ithBit(int n, int k) {
		int mask = (n & (1 << (k))) >> (k);

		return mask; // define the bit 0 or 1;
	}

	static int ithBitSet(int n, int k) {
		int mask = 1 << k;

		return n & mask; // define the number after converting main n;
	}

	// 100110101 = 309 = n;
	// k = 5 // from right side,
	// ithBitSet -> 000100000 = 32 in answer in n 5th bit is 1
	// but ithBit is give ans as 1 only, it showing only answer.

}
