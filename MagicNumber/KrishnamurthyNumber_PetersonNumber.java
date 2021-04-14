package MagicNumber;

import java.util.Scanner;

public class KrishnamurthyNumber_PetersonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(isKrishnamurthyNum(n));

		}
	}

	static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);

	}

	static boolean isKrishnamurthyNum(int n) {
		int sum = 0;
		int temp = n;
		
		while (temp != 0) {
			int lastDigit = temp % 10;
			sum += fact(lastDigit);
			temp /= 10;
		}

		return (sum == n);

	}

}
