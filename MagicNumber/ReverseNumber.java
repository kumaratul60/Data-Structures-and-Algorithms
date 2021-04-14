package MagicNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(reverse(n));
		}
	}

	static int reverse(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		return reverse;
	}

}
