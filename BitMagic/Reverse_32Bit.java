package BitMagic;

import java.util.Scanner;

// 00000000000000000000000000000011   --> 3   i/p
//11000000000000000000000000000000   -->  3221225472  o/p
public class Reverse_32Bit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			System.out.println(reverse(n));
		}

	}

	static long reverse(long a) {
		long res = 0;
		int i = 31;
		while (a > 0) {
			res += (a % 2) * Math.pow(2, i);
			i--;
			a /= 2;
		}
		return res;

	}

}
