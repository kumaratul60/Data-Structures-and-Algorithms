// A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by sum of sequnces of its digits.

/*
19 -> 1^2+9^2 = 1+81 = 82
	8^2+2^2 = 64+4 = 68
	6^2+8^2 = 36+64 = 100
	1^2+0^2+0^2 = 1
so 19 is a happi number.
	
20 -> 2^2+0^2 = 4+0 = 4
	4^2 = 16
	1^2+6^2 = 1+36 = 37
	3^2+7^2 = 9+49 = 58
	5^2+8^2 = 25+64 = 89
	8^2+9^2 = 64+81 = 145
	1^2+4^2+5^2 + 1+16+25 = 42
	4^2+2^0 = 16+4 = 20
	2^2+0^2 = 4+0 = 4
so 20 is not a happi number.

*/



package MagicNumber;

import java.util.HashSet;
import java.util.Scanner;


public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isHappy(n));
		}
	}

	static int numSquareSum(int n) {
		int squareSum = 0;
		while (n != 0) {
			squareSum += (n % 10) * (n % 10);
			n /= 10;
		}
		return squareSum;
	}

	static boolean isHappy(int n) {
		HashSet<Integer> s = new HashSet<>();
		s.add(n);
		while (true) {
			if (n == 1)
				return true;
			n = numSquareSum(n);
			if (s.contains(n) && n != (int) s.toArray()[s.size() - 1])
				return false;
			s.add(n);
		}

	}

}
