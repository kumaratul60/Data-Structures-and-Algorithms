package BitMagic;

import java.util.Scanner;


//  mask = 1 << position

public class Clear_ith_Bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // 309
			int i = sc.nextInt(); // 4
			System.out.println(clear(n, i)); // 293
		}
	}

	static int clear(int n, int k) {
		int musk = 1 << k;
		int new_musk = ~(musk);
		return (n & new_musk);
	}

}
