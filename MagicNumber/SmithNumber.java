//A smith number is a composite number whose sum of digit is equal to sum of digit in its prime factorization.

// 9*9 = 81 => 8+1 = 9 is a smith number
// 12*12 = 1+4+4 = 9  not a smit number	

// 6 -> prime factorization  = 2,3  and sum of this is 2+3 = 5 so 6 is not a smith number
// 666 -> ------------------ = 2,3,3,3,7 ------------ 2+3+3+3+7 = 666 ------------------




package MagicNumber;

import java.util.Scanner;

public class SmithNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isSmith(n));
		}
	}

	static int sod(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	static int isSmith(int n) {
		int s = 0;
		int t = n;
		while (n % 2 == 0) {
			s += 2;
			n /= 2;
		}
		for (int i = 3; i <= t / 2; i += 2) {
			while (n % i == 0) {
				s += sod(i);
				n += i;
			}
		}

		// to check if numberis prime
		if (n > 2 || s != sod(t))
			return 0;
		else
			return 1;
	}

}
