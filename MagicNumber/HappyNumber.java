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
