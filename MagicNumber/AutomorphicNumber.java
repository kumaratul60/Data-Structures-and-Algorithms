// A number is automorphic of its square ends with the same digits as the original number.

// 76*76 = 5776          (last pair is 76 )
//            __

// 7*7 = 49


package MagicNumber;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();

			System.out.println(isAutomorphic(n));
		}

	}

	static boolean automorphic(int n) {

		int originalNum = n;
		int r = 0;
		int square = n * n;
		r = last2Digit(square);
		if (r == originalNum) {
			return true;
		}
		return false;
	}

	static int last2Digit(int n) {
		int last2Digit = n % 100;
		n /= 100;
		return last2Digit;
	}

	static boolean isAutomorphic(int n) {
		int sq = n * n;
		while (n > 0) {
			if (n % 10 == sq % 10)
				return true;
			n /= 10;
			sq /= 10;
		}
		return false;
	}

	static boolean isAutomorphic1(int n) {
		int sq = n * n;
		while (n > 0) {
			if (n % 10 != sq % 10)
				return false;
			n /= 10;
			sq /= 10;
		}
		return true;
	}

}
