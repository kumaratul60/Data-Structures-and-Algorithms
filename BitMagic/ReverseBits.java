package BitMagic;

import java.util.Scanner;

public class ReverseBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(reverse(n));
		}

	}

	static int reverse(int n) {
		int rev = 0;
		while(n>0) {
		
			rev <<= 1;
			if ((n & 1) == 1) {
				rev ^= 1;
			}
			n >>= 1;

		}
		return rev;
	}

}
